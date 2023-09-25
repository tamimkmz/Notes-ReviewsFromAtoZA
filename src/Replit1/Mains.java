package Replit1;

    public class Mains {
        // Declare and initialize a static variable
        static String ss = "Welcome To Syntax Technologies";

        public static void main(String[] args) {
            // First way: Access and print the static variable directly
            System.out.println(ss);

            // Second way: Access and print the static variable using the class name
            System.out.println(Mains.ss);

            // Third way: Access and print the static variable by creating an object of the class (not recommended for static variables)
            Mains obj = new Mains();
            System.out.println(obj.ss);
        }
    }








