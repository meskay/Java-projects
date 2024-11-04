public class Flight {
    private int flightNumber;
    private String departureTime;
    private String destination;
    private boolean transit;
    private double ticketPrice;
    Pilot assignedPilot;
    int seatsE = 9;
    int seatsB = 6;
    int seatsFC = 4;


    public Flight(int flightNumber, String departureTime, String destination, boolean transit) {
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.destination = destination;
        this.transit = transit;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public boolean isTransit() {
        return transit;
    }

    public void setTransit(boolean transit) {
        this.transit = transit;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Pilot getAssignedPilot() {
        return assignedPilot;
    }

    public void setAssignedPilot(Pilot assignedPilot, Flight flight) {
        this.assignedPilot = assignedPilot;
        assignedPilot.assignedFlights.add(flight);
    }

    public void flightInfo(){
        System.out.println("\nFlight " +this.flightNumber +":");
        System.out.println("* Departure time: " +this.departureTime);
        System.out.println("* Destination: " +this.destination);
        if(transit)
            System.out.println("* Is transit");
        else
            System.out.println("* Is NOT transit");
        System.out.println("* Ticket prices:" );
        System.out.println("\t-Economy: $" + this.ticketPrice);
        System.out.println("\t-Business: $" + this.ticketPrice*2);
        System.out.println("\t-First class: $" + this.ticketPrice*6);
        System.out.println("* Available seats: " +this.seatsE);
        if(assignedPilot!=null)
            System.out.println("* Assigned Pilot: Captain " +this.getAssignedPilot().name);
        else
            System.out.println("* Not assigned yet");
    }
}
