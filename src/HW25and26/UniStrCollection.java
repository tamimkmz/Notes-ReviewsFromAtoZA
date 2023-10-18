package HW25and26;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniStrCollection {
   public class UniStrCollection {
    public static void main(String[] args) {
        Set<String> uniqueStrings = new LinkedHashSet<>();
        uniqueStrings.add("Hello");
        uniqueStrings.add("Java");
        uniqueStrings.add("Programming"); // Fixed spelling mistake
        uniqueStrings.add("is fun");
        uniqueStrings.add("Java");

        String concatenatedString = concatenateStrings(uniqueStrings);
        System.out.println(concatenatedString);
    }

    public static String concatenateStrings(Set<String> strings) {
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            sb.append(s);
            sb.append(" ");
        }
        return sb.toString();
    }
}
