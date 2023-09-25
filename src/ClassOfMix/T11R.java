package ClassOfMix;

import java.util.Scanner;
//String s;
//Write a for loop that will print out the reverse of the string.
//Sample input/outputs:
//In: manhattan
public class T11R {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        //String s = inp.nextLine();
        //write your code below
        String str="manhattan";
        String reversed="";

        for (int i=str.length()-1; i>=0;i--){
            reversed=reversed+str.charAt(i);

        }
        System.out.println(reversed);
    }

}












