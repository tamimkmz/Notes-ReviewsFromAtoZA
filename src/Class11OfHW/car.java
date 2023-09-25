package Class11OfHW;

    public class car {
    private String make;
    private String model;
    private int numberOfDoor;
    private int topSpeed;
    private double price;
    public car(String make, String model, int numberOfDoor, int topSpeed, double price){
        this.make=make;
        this.model=model;
        this.numberOfDoor=numberOfDoor;
        this.topSpeed=topSpeed;
        this.price=price;

    }
    public car(String make, String model, int topSpeed, double price){
        this.make=make;
        this.model=model;
        this.numberOfDoor=4;
        this.topSpeed=topSpeed;
        this.price=price;
    }
    public car(int numberOfDoor, int topSpeed, double price){
        this.make="unknown";
        this.model="unknown";
        this.numberOfDoor=numberOfDoor;
        this.topSpeed=topSpeed;
        this.price=price;
}

    public car(String make, String model, int numberOfDoor) {
        this.make = make;
        this.model = model;
        this.numberOfDoor = numberOfDoor;
        this.topSpeed = 90;
        this.price = 0.;

    }
    public void carDisplay(){
        System.out.println("make: "+ make);
        System.out.println("model: " + model);
        System.out.println("number of door: " + numberOfDoor);
        System.out.println("topSpeed: " + topSpeed);
        System.out.println("price: " + price);
        System.out.println();

    }
}
 class Main{
    public static void main(String[] args) {
        car car1 =new car("Toyota", "Prius" ,4 ,120, 30000.0);
        car car2=new car("Toyota", "Prius", 4, 120, 30000.0);
        car car3=new car("unknown", "unknown", 4, 120, 30000.0);
        car car4=new car("Toyota", "Prius", 4, 90, 0.0);
        System.out.println("car 1: ");
        car1.carDisplay();
        System.out.println("car 2: ");
        car2.carDisplay();
        System.out.println("car 3: ");
        car3.carDisplay();
        System.out.println("car 4: ");
        car4.carDisplay();


    }
}