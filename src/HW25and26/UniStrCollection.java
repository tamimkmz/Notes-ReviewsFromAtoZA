package HW25and26;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniStrCollection {
    public static void main(String[] args) {
        Set<String>uniqueString=new LinkedHashSet<>();
        uniqueString.add("Hello");
        uniqueString.add("Java");
        uniqueString.add("Progaramming");
        uniqueString.add("is fun");
        uniqueString.add("Java");
        String concatenatedString = concatenateStrings(uniqueStrings);
        System.out.println(concatenatedString);
    }

}
