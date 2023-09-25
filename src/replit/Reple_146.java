package replit;

public class Reple_146 {
    private String name;
    private String lastName;
    private int employeeId;
    private String startDate;
    private int salary;

    // Non-argument constructor
    public Reple_146() {
        // Initialize instance variables to default values
        this.name = null;
        this.lastName = null;
        this.employeeId = 0;
        this.startDate = null;
        this.salary = 0;
    }

    // Parameterized constructor
    public Reple_146(String name, String lastName, int employeeId, String startDate, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.startDate = startDate;
        this.salary = salary;
    }

    // Print method to display property values
    public void print() {
        System.out.println(name + " " + lastName + " " + employeeId + " " + startDate + " " + salary);
    }

    public static void main(String[] args) {
        // Create an Employee object using the non-argument constructor
        Reple_146 employee1 = new Reple_146();

        // Create an Employee object using the parameterized constructor
        Reple_146 employee2 = new Reple_146("Joe", "Smith", 12345, "01/01/1970", 35000);

        // Print the values of properties for both employees
        System.out.println("Employee 1:");
        employee1.print();

        System.out.println("\nEmployee 2:");
        employee2.print();
    }
}




