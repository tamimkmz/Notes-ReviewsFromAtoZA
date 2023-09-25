package ClassOf12HW;
//Create a method that will print whether given String is palindrome or not
public class Homework3 {
    public static void main(String[] args) {
        String number = "145541";
        String reverse="";
        for (int i = number.length() - 1; i >=0; i--) {
            reverse=reverse+number.charAt(i);
        }
        if(number.equals(reverse)){
            System.out.println(" Is palindrome");
        }else {
            System.out.println("Is not palindrome");
        }
    }
}






