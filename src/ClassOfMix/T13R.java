package ClassOfMix;
// word String
//Write a for loop that will print out every other letter in a String,
// starting with the first letter.  These letters should be printed all
// on one line with no space in between.

public class T13R {
    public static void main(String[] args) {
    String str="Hello";
    for (int i =0; i<str.length();i +=2){// increment by 2 to skip every other word
        System.out.print(str.charAt(i));// method to access the character at the current index i,
    }
       // System.out.println();
    }
}













