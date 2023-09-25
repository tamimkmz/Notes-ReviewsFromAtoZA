package Replit1;
//Create a static method with the following specification
//
//Return Type: String
//
//Method Name: mixString
//
//Parameters:
//
//- a String called s1
//- a String called s2
//
//Then inside method write logic that will return the strings combined, one letter at a time, starting with s1.  See example below for an example.
//
//NOTE: s1 and s2 should be of equal lengths:
public class StringManPul {
    public static String mixString(String s1, String s2) {
        if (s1.length() != s2.length()) {
            throw new IllegalArgumentException("Input strings must have equal lengths.");
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            result.append(s1.charAt(i)).append(s2.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s1 = "12345";
        String s2 = "abcde";

        String mixedString = mixString(s1, s2);
        System.out.println(mixedString); // Output: "1a2b3c4d5e"
    }
}
class TestMixString {
    public static void main(String[] args) {
        String firstValue = mixString("12345", "abcde");
        System.out.println(firstValue);

        String secondValue = mixString("howdy", "hello");
        System.out.println(secondValue);
    }

    public static String mixString(String s1, String s2) {
        if (s1.length() != s2.length()) {
            throw new IllegalArgumentException("Input strings must have equal lengths.");
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            result.append(s1.charAt(i)).append(s2.charAt(i));
        }

        return result.toString();
    }
}