package Class11OfHW;
//Create a String that will hold a sentence.
// Write a program to get a new String without any spaces
public class HomeWorks1 {
    public static void main(String[] args) {
        String str="How are you my friend?. i am good and you?";
        String[] strs=str.split("[.]");

        System.out.println(str.replace(" ",""));
    }
}
