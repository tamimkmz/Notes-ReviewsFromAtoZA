package DragAndDrop;

class Bird {
    private String species;
    private String color;
    private int age;
    private boolean canFly;

    public Bird(String species, String color, int age, boolean canFly) {
        this.species = species;
        this.color = color;
        this.age = age;
        this.canFly = canFly;
    }

    public void printInfo() {
        System.out.println("Species: " + species);
        System.out.println("Color: " + color);
        System.out.println("Age: " + age + " years");
        System.out.println("Can fly? " + (canFly ? "Yes" : "No"));
    }
}
class Sparrow extends Bird {

    public Sparrow(String color, int age, boolean canFly) {
        super("Sparrow", color, age, canFly);
    }
}
class Parrot extends Bird {

    public Parrot(String color, int age, boolean canFly) {
        super("Parrot", color, age, canFly);
    }
}
public class BirdTest {
    public static void main(String[] args) {
        // Create objects of Sparrow and Parrot
        Sparrow sparrow = new Sparrow("Brown", 2, true);
        Parrot parrot = new Parrot("Green", 5, true);

        System.out.println("Sparrow Information:");
        sparrow.printInfo();
        System.out.println();

        System.out.println("Parrot Information:");
        parrot.printInfo();
    }
}