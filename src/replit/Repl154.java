package replit;

public class Repl154 {
   // Constructor without parameters
    public Repl154(){
          System.out.println("Parent constructor without argument");
   }// Constructor with an integer parameter
public Repl154(int number){// Constructor without parameters in the child class
    System.out.println(number);
}
    static class Child extends Repl154 {
        public Child(){
          System.out.println("Child constructor without argument");
      }
        public Child(int number){// Constructor without parameters in the child class
            System.out.println(number);
        }

    }

    public static void main(String[] args) {
        Child c =new Child();
        System.out.println(10);

    }
}

