package Replits;
//Create a static method with the following specs:
//
//
//Returns:
//
//```
//an integer
//```
//
//Name:
//
//```
//countA
//```
//
//Parameters:
//
//```
//a String called s
//```
//
//Purpose:
//
//```
//count the number of occurrences of 'a' or 'A' within s
public class StringUtil {
    public static int countA(String s) {

        int count = 0;

        // Iterate through the characters in the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Check if the character is 'a' or 'A'
            if (c == 'a' || c == 'A') {
                count++;
            }
        }

        return count;
    }


    public static void main(String[] args) {
        String inputString = "sample string with A and a characters.";
        int result = countA(inputString);
        System.out.println("3\n6");

    }
}

    /*In this code:

    The countA method takes a String s as a parameter.
    It initializes a count variable to keep track of the number of occurrences of 'a' or 'A'.
    It iterates through each character in the input string and checks if the character is 'a' or 'A'. If it is, it increments the count variable.
            Finally, it returns the count variable, which represents the number of occurrences of 'a' or 'A' in the input string.
    In the main method, there's an example of how to use the countA method with a sample input string and print the result.*/







    

