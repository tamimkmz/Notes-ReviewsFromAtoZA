package ConstructionOfBook;
//Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
//Define common behavior within and some fields in parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Create objects of child classes and store them into array. Loop through each object and execute available methods.
public class Computer {
    private String brand;
    private double price;
    private int protectionWarranty;

    public Computer(String brand, double price, int protectionWarranty) {
        this.brand = brand;
        this.price = price;
        this.protectionWarranty = protectionWarranty;
    }

    public void takePicture() {
        System.out.println(brand + " computer is take picture.");
    }
    public void takeScreenShot() {
        System.out.println(brand + " computer is take screenshot.");
}

    public void printInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
        System.out.println("protectionWarranty: " + protectionWarranty);
    }
}
class Apple extends Computer {
    public Apple(String brand, double price, int protectionWarranty) {
        super(brand, price, protectionWarranty);
        }
    public void takePicture() {
        System.out.println("Apple computer is take picture with the apple camera.");
    }
    public void useFaceId(){
        System.out.println("using face Id to unlock computer.");
}
}
class Lenovo extends Computer {
    public Lenovo(String brand, double price, int protectionWarranty) {
        super(brand, price, protectionWarranty);
    }
    public void takePicture() {
        System.out.println("Lenovo computer is take picture with lenovo camera.");
    }
    public void useTrackPoint() {
        System.out.println("Using the TrackPoint for precise navigation.");
    }
}
class HP extends Computer {
    public HP(String brand, double price, int protectionWarranty) {
        super(brand, price, protectionWarranty);
    }
    public void takePicture() {
        System.out.println("HP computer is take picture with HP camera.");
    }
    public void useTouchscreen() {
        System.out.println("Using the touchscreen for intuitive interaction.");
    }
}
class Dell extends Computer {
    public Dell(String brand, double price, int protectionWarranty) {
        super(brand, price, protectionWarranty);
    }
    public void takePicture() {
        System.out.println("Dell computer is take picture with Dell camera.");
    }
    public void useVectorGraphics() {
        System.out.println("Using Vector graphics for any performances.");
    }
}
class Main {//
    public static void main(String[] args) {
        Computer[] computers=new Computer[4];
        computers[0]=new Computer("Apple", 800.0,4);
        computers[1]=new Computer("Lenovo", 700.0,3);
        computers[2]=new Computer("HP", 600.0,2);
        computers[3]=new Computer("Dell", 500.0,1);

        for (Computer computer :computers){
            computer.takePicture();
            computer.printInfo();
            computer.takeScreenShot();
            System.out.println();

        }
    }

    }