package GroupExercise2;
//Check if Two Strings are Anagrams: Given two strings, determine if
//they are anagrams, meaning they contain the same characters in a
//different order. For example, "listen" and "silent" vase=save /night=thing are anagrams.
import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String str1="karim";
        String str2="mirak";
// Convert to character arrays
        char[] char1=str1.toCharArray();
        char[] char2=str2.toCharArray();
// Sort the character arrays
        Arrays.sort(char1);
        Arrays.sort(char2);

        boolean areAnagrams = Arrays.equals(char1, char2);
        System.out.println(areAnagrams);

    }
}
