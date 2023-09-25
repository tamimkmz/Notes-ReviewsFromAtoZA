package replit;

// Constructor with a String parameter.
 class ParentPa {
    public ParentPa() {// Constructor without parameters
        System.out.println("This is parent constructor");
    }

    public void Method() {
    }

    public void Hello() {
    }

    //Create a Child Class that will be subclass of the Parent class
    static class Child extends ParentPa {
    //Create a constructor without parameter and "/call parent class constructor /"explicitly.
    public Child() {// "/Call the constructor of the parent class/"
        super();

    }
}
        public static void main(String[] args) {
        Child c =new Child();


        }
    }





