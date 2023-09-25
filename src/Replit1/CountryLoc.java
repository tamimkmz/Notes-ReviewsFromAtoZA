package Replit1;
//Declare two static variables to hold
//
//- country name
//- continent
//
//Create a method to display the value of static variables in the following format:
//
//
//
//____ located on \_\_\_\_ continent
//
//In the main method assign values to a static variable and execute method display
public class CountryLoc {
    static String countryName;
    static String continent;

    public static void display() {
        System.out.println(countryName + " located on " + continent + " continent");
    }

    public static void main(String[] args) {
        // Assign values to static variables
        countryName = "Morocco";
        continent = "Africa";

        // Execute the display method
        display();
    }
}
