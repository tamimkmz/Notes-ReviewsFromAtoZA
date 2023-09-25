package Replit1;

public class Tamim {
    // This method counts the number of vowels (a, e, i, o, u) in a given string
    public static int countVowels(String s) {
        int count = 0; // Initialize a count to keep track of the number of vowels

        // Loop through each character in the input string 's'
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // Get the character at index 'i' in the string 's'

            // Check if the character 'c' is a vowel (a, e, i, o, u)
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++; // Increment the count if 'c' is a vowel
            }
        }

        return count; // Return the total count of vowels in the string
    }

    // This is the main method where we test the 'countVowels' method
    public static void main(String[] args) {
        System.out.println(countVowels("obama")); // Call 'countVowels' with the string "obama", expects 3
        System.out.println(countVowels("happy friday! i love weekends")); // Call 'countVowels' with a longer string, expects 9
    }
}
/*
Here's how the code works:

       The countVowels method is defined. It takes a single parameter, a string s, and returns an integer representing the count of vowels in the string.

        Inside the countVowels method, an int count variable is initialized to zero. This variable will keep track of the count of vowels in the string.

        The code enters a for loop that iterates over each character in the input string s. It uses an index variable i to access each character one by one.

        For each character at index i in the string, the code assigns it to the variable char c.

        The code then checks whether the character c is a vowel (a, e, i, o, u) by using a series of if statements. If c is a vowel, it increments the count variable by 1.

        After looping through all the characters in the string, the count variable contains the total count of vowels in the string, so it is returned as the result of the method.

        In the main method, two test cases are provided:

        The first test case calls countVowels with the string "obama" and prints the result. It expects the count of vowels in "obama," which is 3 (o, a, a).
        The second test case calls countVowels with a longer string and prints the result. It expects the count of vowels in the longer string, which is 9.

*/


