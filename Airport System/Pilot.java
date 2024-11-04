import java.util.ArrayList;
public class Pilot extends Person{
    private int age;
    private boolean gender; //true=female //false=male
    private double salary;
    ArrayList<Flight> assignedFlights = new ArrayList<>();

    public Pilot(String name, int age, boolean gender, double salary) {
        super(name);
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public Pilot() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0)
            age =-age;
        if (age<18)
            System.out.println("Sorry we can't accept ppl under 18");
        else if (age>110)
            System.out.println("Sorry we don't hire vampires");
        else
            this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<0)
            this.salary=0;
        else
            this.salary = salary;
    }


    void viewAssignedFlights(){
        System.out.println("Assigned flights to Captain " +this.name +":");
        for (int i = 0;i<this.assignedFlights.size();i++){
            System.out.println(i+1 +"Flight" +this.assignedFlights.get(i).getFlightNumber());
        }
        if(this.assignedFlights.isEmpty()){
            System.out.println("No flights have been assigned yet");
        }
    }
    void PilotInfo(){
        System.out.println("Captain " +this.name);
        System.out.println("Age: " +this.age);
        System.out.println("Salary: $" +this.salary);
        this.viewAssignedFlights();
    }
}
