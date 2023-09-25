package RevisedPackage;
/*In Java methods Create a Super Class Tea that will have:
- instance variable teaType;
- constructor that will initialize
- unimplemented method addSugar(),
Create 2 subclasses of Tea as Lemon Tea and Chai Tea.
In main class create an object of 2 Child and assign them to Parent reference type.
Execute method addSugar from both classes.
**Expected Output:**
For Lemon Tea we need 2 spoons of sugar
For Chai Tea we need 1 spoon of sugar*/
public class Tea {
    String teaType;

    Tea(String teaType) {
        this.teaType = teaType;
    }

    public Tea() {

    }

    // unimplemented method
    void addSugar() {
    }

    class lemonTea extends Tea {

        lemonTea(String teaType) {
            super(teaType);
        }

        public lemonTea() {
            super();
        }

        void addSugar() {
            System.out.println("For Lemon Tea we need 2 spoons of sugar");
        }
    }

    class ChaiTea extends Tea {
        ChaiTea() {
            super(" Chai Tea");
        }


        void assSugar() {
            System.out.println("For Chai Tea we need 1 spoon of sugar");
        }
    }

    public class Main {
        public void main(String[] args) {
            Tea tea1 = new lemonTea();
            Tea tea2 = new ChaiTea();

            tea1.addSugar();
            tea2.addSugar();
        }
    }
}