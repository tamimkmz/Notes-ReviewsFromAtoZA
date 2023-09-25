package GroupExercise2;
/*Check if a String is Palindrome: Determine whether a given string is
        a palindrome, which means it reads the same forwards and
        backward. For example, "madam" is a palindrome.
*/
public class PalindromeFinder {
    public static void main(String[] args) {
        String s1 = "madam";
        System.out.println(s1+ " ia a palindrome: "+isPalindrome(s1));
    }

    private static boolean isPalindrome(String s1) {
      //  s1=s1.replaceAll("\\s+","").toLowerCase();
        int left=0;
        int right= s1.length()-1;
        while (left<right){
            if(s1.charAt(left) !=s1.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

}
