import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Manager extends Person{
    String password;
    static ArrayListPilot pilots = new ArrayList();
    Scanner S = new Scanner(System.in);

    public Manager(String name, String password) {
        super(name);
        this.password = password;
    }

    void AddPilot(){
        pilots.add(new Pilot());

        System.out.print(name );
        pilots.getLast().setName(S.next());

        do {
            System.out.print(age );
            pilots.getLast().setAge(Exception());
        }while(pilots.getLast().getAge()==0);

            boolean pass = true;
        do{
            System.out.print(gender (malefemale) );
            String gender = S.next();
            if(gender.equalsIgnoreCase(female)){
               pilots.getLast().setGender(true);
               pass = false;
            }
            else if(gender.equalsIgnoreCase(male)){
               pilots.getLast().setGender(false);
               pass = false;
            }
            else{
               System.out.println(Invalid gender);
        }}while (pass);

        System.out.print(salary );
        pilots.getLast().setSalary(S.nextDouble());

        System.out.println(nCaptain  +pilots.getLast().name + has successfully joined the crew);
    }
    void removePilot(String name){
        int y = pilots.size();
        int i;
        for (i =0;ipilots.size();i++){
            if (name.equalsIgnoreCase(pilots.get(i).name)){
                break;}}
        for (int j =0;jpilots.get(i).assignedFlights.size();j++){
            pilots.get(i).assignedFlights.get(j).assignedPilot=null;
        }
        pilots.get(i).assignedFlights.clear();
        pilots.remove(i);
        if(y==pilots.size()){
            System.out.println(Pilot wasn't found);
        }
        else{
            System.out.println(Pilot has been removed successfully);
        }
    }
    void manageSystem(ArrayListFlight flights) {
        int x;
        do {
            System.out.println(nWould you like to check nt1-Flights nt2-Pilots nt0-Return to main menu);
            x = Exception();
            switch (x) {
                case 1
                    checkFlights(flights);
                    break;
                case 2
                    checkPilots();
                    break;
                case 0
                    break;
                default
                    System.out.println(Please enter a valid number);
                    break;
            }
        } while (x!= 0);

    }
    void checkFlights(ArrayListFlight flights){
        for (int i =0; iflights.size();i++){
          if(flights.get(i).assignedPilot!=null)
        System.out.println(i+1 +.Flight  +flights.get(i).getFlightNumber() + (assigned to Captain  + flights.get(i).assignedPilot.name +));
        else
        System.out.println(i+1 +.Flight  +flights.get(i).getFlightNumber() + (not assigned to a pilot yet));
        }
            System.out.println();
            System.out.println(nWould you like to nt1-check flight info nt2-Assign flight to Pilot nt(press any other number to go back));
            int x = Exception();
            switch (x){
                case 1
                case 2
                    int nFlight;
                    while (true) {
                    try{
                        System.out.println(nchoose the flight's number from the list's order (1- +flights.size() +));
                        nFlight = Exception();

                    if (x==1){
                        flights.get(nFlight-1).flightInfo();}
                    else{
                        if (flights.get(nFlight-1).assignedPilot!=null){
                            System.out.println(Flight  +flights.get(nFlight-1).getFlightNumber()+ has already been assigned to Captain  + flights.get(nFlight-1).assignedPilot.name);
                        }
                        else{
                        for (int j =0; jpilots.size();j++){
                            System.out.println(j+1 +.Captain  +pilots.get(j).name);}

                        System.out.println(Choose a pilot);
                        int nPilot = Exception();
                        flights.get(nFlight-1).setAssignedPilot(pilots.get(nPilot-1),flights.get(nFlight-1));
                        System.out.println(Flight  +flights.get(nFlight-1).getFlightNumber() + has been successfully assigned to Captain  +pilots.get(nPilot-1).name);
                        }
                    }
                        break;}
                    catch (IndexOutOfBoundsException e){}}
                    break;
                case 0
                    break;
                default
                    System.out.println(Please enter a valid number);
            }
        }
        void checkPilots(){
            System.out.println(Captains on duty);
            for (int i =0;ipilots.size();i++){
                System.out.println(t+(i+1) +. Captain  +pilots.get(i).name);
            }

            System.out.println(nWould you like to nt1-Check pilot info nt2-change pilot's salary nt3-Add pilot nt4-Remove pilot nt(press any other number to go back));
            int x = Exception();
            switch (x){
                case 1
                case 2
                    while (true){
                    try{
                    System.out.println(choose the pilot's number from the list's order (1- +pilots.size() +));
                    int nPilot = Exception();
                    if (x==1){
                        pilots.get(nPilot-1).PilotInfo();
                    }
                    else{
                        System.out.println(Captain  + pilots.get(nPilot-1).name +'s current salary is $ +pilots.get(nPilot-1).getSalary());
                        System.out.println(Change salary to $);
                        pilots.get(nPilot-1).setSalary(S.nextDouble());
                        System.out.println(Captain  + pilots.get(nPilot-1).name +'s current salary has successfully been changed to $ +pilots.get(nPilot-1).getSalary());
                    }
                        break;}
                    catch (IndexOutOfBoundsException e){}}
                    break;
                case 3
                    AddPilot();
                    break;
                case 4
                    System.out.println(Enter the pilot's name );
                    removePilot(S.next());
                    break;
            }
        }
        
        static int Exception() {
            Scanner S = new Scanner(System.in);
            int x;
            do {
                try {
                    x = S.nextInt();
                    break;
                } catch (ArithmeticException e) {
                    System.out.println(Invalid number);
                    S.nextLine();
                } catch (InputMismatchException e) {
                    System.out.println(Please enter a number);
                    S.nextLine();
                } catch (Exception e) {
                    System.out.println(Something went wrong);
                    S.nextLine();
                }
            } while (true);
            return x;
        }
}

