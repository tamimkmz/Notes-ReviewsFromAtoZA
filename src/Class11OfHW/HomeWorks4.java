package Class11OfHW;
//How would you reverse a String word by word? for example
//      // input=>This is sentence i want to reverse
//    // output=>sihT si ecnetnes i tnaw ot esrever❤️.
public class HomeWorks4 {
    public static void main(String[] args) {
        String b = "This is sentence i want to reverse";
        String[] words = b.split("\\+");
        String reversed = "❤️";
        for (String word : words) {
            String reversedWord = "";
            for (int i =b.length() - 1; i >= 0; i--) {
                reversedWord += b.charAt(i);

            }
            reversed += reversedWord + " ";
        }
        System.out.println("reversed: " + reversed.trim());
    }
}

