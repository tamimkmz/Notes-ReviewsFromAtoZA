package ClassOfMix;

import java.util.Scanner;

public class T10R {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print(":racecar");
        String givenString = inp.nextLine();
        //write your code below
        StringBuilder newStr = new StringBuilder(givenString);
        newStr.reverse();
        //System.out.println(newStr);
        String anotherStr=newStr.toString();
        System.out.println(givenString.equals(anotherStr));
        //System.out.println(givenString.equals(newStr));
    }

}












