package ClassOfMix;
//String s;
//Write a for loop that will print out each letter of the string s, separated by spaces, on the same line.
//Sample input/outputs:
//In: hello

import java.util.Scanner;

public class T15R {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In: ");
        String s = inp.nextLine();
        //String s1 = "covert";
        for (int i =0; i<s.length();i ++){

       char letter=s.charAt(i);// method to access the character at the current index i,
        System.out.print(letter+ " ");
            if (i < s.length() - 1) {
                System.out.print(" ");
            }
    }
        System.out.println();
    }

}













