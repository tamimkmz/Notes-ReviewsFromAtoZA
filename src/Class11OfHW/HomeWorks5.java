package Class11OfHW;
//How would you check if String is palindrome or not? aba=> true
//Abbc =>false
public class HomeWorks5 {
    public static void main(String[] args) {
        String str = "John";
        String reverse="";
        for (int i = str.length() - 1; i >=0; i--) {
           reverse=reverse+str.charAt(i);
            }
           if(str.equals(reverse)){
               System.out.println("true");
        }else {
               System.out.println("false");
           }
    }
}

