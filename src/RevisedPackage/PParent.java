package RevisedPackage;
/*Create a Parent Class in which you will have 1 implemented method m2 and 1 unimplemented method m1

Make Main class to be a derived class from Parent.

In main method execute both methods

**Expected Output:**

```
Child class providing implementation
Parent class providing implementation*/
abstract public class PParent {
void m2(){
    System.out.println("parent class providing implementation");
}
abstract void m1();
    }
    class Main extends PParent{
    void m1(){
        System.out.println("child class providing implementation");
    }

        public static void main(String[] args) {
            Main child =new Main();
            child.m1();
            child.m2();

        }
}
