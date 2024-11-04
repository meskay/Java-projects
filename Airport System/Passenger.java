import java.util.ArrayList;
import java.util.Scanner;
public class Passenger extends Person{
    ArrayList<Flight> bookingHistory = new ArrayList<>();
    ArrayList<String> bookingHistoryTicket = new ArrayList<>();

    double BookFlight(Flight flight, int i){
        Scanner S = new Scanner(System.in);
        int x;
        while(true){
            System.out.println("\nChoose seat " +i +" class:");
        System.out.println(1+".Economy: $" + flight.getTicketPrice());
        System.out.println(2+".Business: $" + flight.getTicketPrice()*2);
        System.out.println(3+".First class: $" + flight.getTicketPrice()*6);
        x = S.nextInt();
        if(x==1&&flight.seatsE==0)
            System.out.println("!No more economy seats available!");
        else if(x==2&&flight.seatsB==0)
            System.out.println("!No more business seats available!");
        else if(x==3&&flight.seatsFC==0)
            System.out.println("!No more first class seats available!");
        else if (x>0&&x<=3){
                this.bookingHistory.add(flight);
                switch (x){
                    case 1:
                        this.bookingHistoryTicket.add("Economy");
                        flight.seatsE--;
                         return flight.getTicketPrice();
                    case 2:
                        this.bookingHistoryTicket.add("Business");
                        flight.seatsB--;
                        return flight.getTicketPrice()*2;
                    case 3:
                        this.bookingHistoryTicket.add("First class");
                        flight.seatsFC--;
                        return flight.getTicketPrice()*6;
                }}
            //case 0:
        else{
            System.out.println("!Invalid number!");
            }
        }
    }
    void ViewBookingHistory(){
        if(bookingHistory.isEmpty()){
            System.out.println("No flights have been booked yet");
        }
        else {
            System.out.println("Booked flights:");
            for (int i = 0; i < bookingHistory.size(); i++) {
                System.out.println("\t"+(i+1) + ". Flight " + bookingHistory.get(i).getFlightNumber() + " ~ " +bookingHistoryTicket.get(i));
            }
        }
    }
}
