
package GroupExercise2;
//Reverse a String: Write a function to reverse a given string. For
//example, given the input "Hello", the output should be "olleH".
public class ReverseString {
    public static void main(String[] args) {
        String input ="Hello";
        String reversed=reverseString(input);
        System.out.println("Original string: " +input);
        System.out.println("reversed string: " +reversed);
    }
    public static String reverseString(String input) {
        StringBuilder sB = new StringBuilder(input);
        sB.reverse();
        String reversedString = sB.toString();

        return reversedString;
    }
}
