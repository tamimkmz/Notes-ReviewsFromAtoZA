package Replit1;

public class AlphabeticalUtility {

        public static boolean alphabetical(char c1, char c2) {
            return c1 < c2;
        }

    public static void main(String[] args) {
        // Test cases
        System.out.println(alphabetical('a', 'b')); // true
        System.out.println(alphabetical('a', 'a')); // false
        System.out.println(alphabetical('b', 'a')); // false
        System.out.println(alphabetical('d', 'z')); // true
        System.out.println(alphabetical('z', 'x')); // false
    }
}
