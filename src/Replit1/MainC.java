package Replit1;

public class MainC {
        static int instanceCount = 0; // Static variable to hold the count of instances

        public MainC() {
            instanceCount++; // Increment the count each time an object is created
        }

        public static void main(String[] args) {
            // Create three objects of the class
            MainC obj1 = new MainC();
            MainC obj2 = new MainC();
            MainC obj3 = new MainC();

            // Print the value of the count variable
            System.out.println("Count of instances: " + MainC.instanceCount);
        }
    }

