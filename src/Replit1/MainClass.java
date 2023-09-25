package Replit1;

public class MainClass {

    // Variables with different access modifiers
    private String name;
    protected String city;
    String schoolName; // Default access modifier
    public int batchNumber;

    // Constructor to initialize variables
    public MainClass(String name, String city, String schoolName, int batchNumber) {
        this.name = name;
        this.city = city;
        this.schoolName = schoolName;
        this.batchNumber = batchNumber;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("My name is " + name + " and I live in " + city + ". " +
                "I study at " + schoolName + " in batch " + batchNumber);
    }

    public static void main(String[] args) {
        // Create an instance of MainClass and assign values
        MainClass student = new MainClass("John", "Miami", "Syntax", 9);

        // Execute the display method
        student.displayDetails();
    }
}
