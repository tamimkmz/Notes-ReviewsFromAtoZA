package GroupExercise2;
/*Find the First Non-Repeating Character in a String: Given a string,
find and return the first non-repeating character. For example, in the
string "abracadabra", the first non-repeating character is 'c'.
*/
public class FirstNonRepeatingChar {
    /*public static void main(String[] args) {
        String input = "abracadabra";
        char firstNonRepeating = findFirstNonRepeatingChar(input);

        System.out.println("The first non-repeating character is: " + firstNonRepeating);
    }
    public static char findFirstNonRepeatingChar(String str) {
        int[] charCount = new int[199]; // Assuming ASCII characters

        // Count the occurrences of each character in the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCount[c]++;
        }

        // Find the first character with a count of 1 (non-repeating)
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCount[c] == 1) {
                return c;
            }
        }

        // If no non-repeating character is found, return a default character (e.g., ' ' or '\0')
        return ' ';
    }
}*/

    public static char findFirstNonRepeatingChar(String str) {
        char [] cArr=str.toCharArray();
        for (char currentChar : cArr) {
            int count = 0;
            for (char c : str.toCharArray()) {
                if (currentChar == c) {
                    count++;
                }
            }
            if (count == 1) {
                return currentChar;
            }
        }
        return 0;
    }
    public static void main(String[] args) {

        char firstNonRepChar = findFirstNonRepeatingChar("abracadabra");
        if (firstNonRepChar != 0) {
            System.out.println("The first non-repeating character is: " + firstNonRepChar);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
