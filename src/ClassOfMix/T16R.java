package ClassOfMix;
//Create an array of names that will hold 5 String elements.
      //  Names must be taking from a user.
        //Print out the first three characters of each element of the array, one per line.
        //Note: every array element must be at least 3 characters long.
        //Input Example:
        //John
        //Expected Output:
        //**Joh**


import java.util.Scanner;

public class T16R {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];//
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
            while (names[i].length() < 3) { // Ensure that each name is at least 3 characters long
                //System.out.println("Name must be at least 3 characters long. Please enter a valid name.");
              //  System.out.print("Enter name " + (i + 1) + ": ");
                names[i] = scanner.nextLine();
            }
        }

        System.out.println("First three characters of each name:");
        for (String name : names) {
            System.out.println(name.substring(0, Math.min(3, name.length())));
        }
    }

}






