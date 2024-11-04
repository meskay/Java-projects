import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        Manager manager = new Manager("MrWhite","123456");
        Passenger p1 = new Passenger();
        //business first class economy

        Manager.pilots.add(new Pilot("Micheal",28,false,12000.0));
        Manager.pilots.add(new Pilot("Sebastien",41,false,14000.0));

        ArrayList<String> destinations = new ArrayList<>();
        destinations.add("Los Angelos - USA");
        destinations.add("Paris - France");
        destinations.add("Moscow - Russia");
        destinations.add("Rome - Italy");
        destinations.add("Toronto - Canada");

        ArrayList<Double> ticketPrice = new ArrayList<>();
        ticketPrice.add(1950.5);
        ticketPrice.add(1225.75);
        ticketPrice.add(1550.5);
        ticketPrice.add(850.75);
        ticketPrice.add(2005.75);

        ArrayList<Flight> flights = new ArrayList<>();
        flights.add(new Flight(102,"10 may 2024 - 8:30am",destinations.get(0),false));
        flights.add(new Flight(203,"11 may 2024 - 6:00am",destinations.get(1),false));
        flights.add(new Flight(304,"11 may 2024 - 9:00pm",destinations.get(2),false));
        flights.add(new Flight(405,"12 may 2024 - 6:00am",destinations.get(3),false));
        flights.add(new Flight(406,"12 may 2024 - 9:00am",destinations.get(2),false));
        flights.add(new Flight(506,"12 may 2024 - 6:00pm",destinations.get(1),false));
        flights.add(new Flight(507,"12 may 2024 - 6:00pm",destinations.get(4),false));
        flights.add(new Flight(602,"14 may 2024 - 6:00pm",destinations.get(1),false));
        flights.add(new Flight(607,"15 may 2024 - 1:00am",destinations.get(2),false));
        flights.add(new Flight(608,"17 may 2024 - 1:00am",destinations.get(0),false));
        flights.add(new Flight(609,"17 may 2024 - 1:00am",destinations.get(4),false));

        for (Flight flight : flights) {
            for (int j = 0; j < destinations.size(); j++) {
                if (flight.getDestination().equals(destinations.get(j)))
                    flight.setTicketPrice(ticketPrice.get(j));
            }}

        flights.get(0).setAssignedPilot(Manager.pilots.get(0),flights.get(0));
        flights.get(1).setAssignedPilot(Manager.pilots.get(0),flights.get(1));
        flights.get(2).setAssignedPilot(Manager.pilots.get(1),flights.get(2));
        flights.get(4).setAssignedPilot(Manager.pilots.get(1),flights.get(4));
        flights.get(5).setAssignedPilot(Manager.pilots.get(0),flights.get(5));

        int x;
        do{
            System.out.println("\nWelcome to our Airport System!!");
           System.out.println("\nYou are a: \n\t1-Passenger \n\t2-Manager \n\t0-Exit");
           x = Manager.Exception();
           switch (x){
               case 1:
                   System.out.println("Please enter your name:");
                   p1.setName(S.next());
                   System.out.println("\nWelcome " +p1.getName());
                   Passenger(p1,destinations, flights);
                   break;
               case 2:
                   while(true){
                       System.out.println("Enter your name:");
                       String name = S.next();
                       if (!name.equalsIgnoreCase(manager.getName())){
                           System.out.println("name was not found on the system");}
                       else{
                           break;}}
                   while (true){
                       System.out.println("Enter your password:");
                       String password = S.next();
                       if(password.equals(manager.password))
                           break;
                       System.out.println("Password doesn't match");
                   }
                   System.out.println("\nWelcome " +manager.getName());
                   manager.manageSystem(flights);
                   break;
               case 0:
                   break;
               default:
                   System.out.println("Please enter a valid");
           }
        }while (x!=0);
    }
    public static void Passenger(Passenger p1, ArrayList<String> destinations, ArrayList<Flight> flights){
        int x;
        do {
            System.out.println("\nWould you like to: \n\t1-Book flight \n\t2-Check booking history \n\t0-Return to main menu");
            x = Manager.Exception();
            switch (x) {
                case 1:
                    System.out.println("\nAvailable destinations:");
                    for (int i = 0; i < destinations.size(); i++) {
                        System.out.println("\t"+(i+1) + ". " + destinations.get(i));
                    }
                    System.out.println("\nChoose a destination from the list (1->" +destinations.size() +"):");
                    int nDestination = Manager.Exception();

                    System.out.println("\nAvailable flights to " +destinations.get(nDestination-1) +":");
                    for (Flight flight : flights) {
                        if (flight.getDestination().equals(destinations.get(nDestination - 1))) {
                            System.out.println("\tFlight " + flight.getFlightNumber() + " | " + flight.getDepartureTime());
                        }
                    }
                    boolean found=true;
                    int i;
                    do{
                        System.out.println("\nChoose flight number:");
                        int flightNumber = Manager.Exception();
                        for (i=0;i<flights.size();i++) {
                           if (flightNumber == flights.get(i).getFlightNumber() && flights.get(i).getDestination().equals(destinations.get(nDestination - 1))){
                               found =false;
                               break;
                        }}
                           if(!found)
                               flights.get(i).flightInfo();
                           else
                               System.out.println("Flight number was not found");
                    }while(found);

                    boolean done = true;
                    do{
                        System.out.println("\nWould you like to book this flight? 1-Yes 0-No");
                        int y = Manager.Exception();
                        switch (y){
                           case 1:
                               int nSeats;
                               System.out.println("\nHow many seats would you like to book? ");
                               do {
                                   System.out.println((flights.get(i).seatsE+flights.get(i).seatsB+flights.get(i).seatsFC) + " seats are available"
                                           +"\n(" +flights.get(i).seatsE +" economy/ " +flights.get(i).seatsB +" business/ " +flights.get(i).seatsFC +" first class)");
                                   nSeats = Manager.Exception();
                               }while(nSeats>flights.get(i).seatsE+flights.get(i).seatsB+flights.get(i).seatsFC);

                               double total=0;
                               for(int j=0;j<nSeats;j++) {
                                  total += p1.BookFlight(flights.get(i),(j+1));
                               }
                               System.out.println("\nYour flights have been booked successfully booked");
                               System.out.println("Your total will be = $" +total);

                               done = false;
                               System.out.println("\nThank you for choosing our Airport!");
                               break;
                           case 0:
                               done = false;
                               break;
                           default:
                               System.out.println("Invalid number");
                               break;
                    }}while(done);
                    break;
                case 2:
                    p1.ViewBookingHistory();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please enter a valid number");
            }
        }while (x != 0) ;
    }
}
