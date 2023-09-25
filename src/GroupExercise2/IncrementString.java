package GroupExercise2;
//Write a Java Function that increments a string,
//It should take the string of unknown length. Don't use regular
//expressions. Examples:
//123 -> 124
//53456 -> 53457
//29 -> 30
//Function signature:
//string Increment (string str)
public class IncrementString {
    public static void main(String[] args) {
        String str1="123";
        String str2="53456";
        String str3="29";
        System.out.println("Incremented str1: " + increment(str1));
        System.out.println("Incremented str2: " + increment(str2));
        System.out.println("Incremented str3: " + increment(str3));
    }
    public static String increment(String str){
        int num=Integer.parseInt(str);
        num++; // Increment the integer
        return Integer.toString(num);

    }

}
