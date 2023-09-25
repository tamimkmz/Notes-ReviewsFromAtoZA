package ClassOfMix;

import java.util.Scanner;

//Using Scanner class input string value.
//Print out the following: "The first 3 letters of \_\_\_ is ___"```
//For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".
public class T6R {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("ban: ");
        String input=scanner.nextLine();
        scanner.close();
        if(input.length()>=6) {
            String firstThreeLetters = input.substring(0,3);
            System.out.println(""+ firstThreeLetters);
        }else{
            System.out.println(" the String is too short to extract 3 letters");
        }


    }
}
