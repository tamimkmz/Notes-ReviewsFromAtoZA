package Replit1;

public class TamimStudent {
    private String name;
    protected String city;
    String schoolName;
    public int batchNumber;
    public TamimStudent(String name, String city, String schoolName, int batchNumber) {
        this.name = name;
        this.city = city;
        this.schoolName = schoolName;
        this.batchNumber = batchNumber;
    }
    public void displayDetails() {
        System.out.println("My name is " + name + " and I live in " + city + ". " +
                "I study at " + schoolName + " in batch " + batchNumber);
    }
    public static void main(String[] args) {
        TamimStudent student = new TamimStudent("John", "Miami", "Syntax", 9);
        student.displayDetails();
    }
}

