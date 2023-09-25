package replit;
//Step1: Create Interface as FirstInterface and create undefined method as firstMethod (without parameter)
//
//Step 2: Create another interface as SecondInterface in which create a method as secondMethod (Without Parameter)
//
//Step 3: Inherit both interfaces to Main class.
//
//Step 4: Execute both methods
interface FirstInterface {
    void firstMethod();
}
interface SecondInterface2 {
    void secondMethod();
}

class Main implements FirstInterface, SecondInterface2 {
    public void firstMethod() {
        System.out.println("First Method implementing multiple Inheritance");
    }

    public void secondMethod() {
        System.out.println("Second Method implementing multiple Inheritance");
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.firstMethod();
        main.secondMethod();
    }
}
