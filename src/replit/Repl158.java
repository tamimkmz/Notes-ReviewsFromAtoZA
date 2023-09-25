package replit;

public class Repl158 {
    protected String city;// Class variable
    public Repl158(String city) {// Constructor


        this.city = city;// Assign the parameter value to the class variable
    }
    public void Display(){// Display method
        System.out.println("City name " + city);
    }


    public static class Child extends Repl158{

    public Child(String city){
        super(city);// Call the superclass constructor and pass the parameter
    }


    }

    public static void main(String[] args) {
      Child child=new Child("Fairfax"); // Create an object of Child class with the city name
      child.Display(); // Call the display method to print the city name
    }
}
