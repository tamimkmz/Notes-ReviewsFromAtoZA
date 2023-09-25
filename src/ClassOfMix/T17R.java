package ClassOfMix;
//There is a code that takes input as a String.
//Write a program that will print out only vowels of that string
//Sample input/outputs:
//In: howdyho
//oo
import java.util.Scanner;

public class T17R {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (isVowel(currentChar)) {
                System.out.print(currentChar);
            }
        }
    }

    private static boolean isVowel(char ch) {
        return ch=='a'|| ch=='e'||ch== 'i'|| ch=='o'||ch == 'u';

    }
}









