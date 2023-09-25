package GroupExercise2;
/*You have a list of strings and you want to keep only those that start
with “A” and you want to return them in lower case"
*/
import java.util.List;
import java.util.stream.Collectors;

public class StringListOfFruits {
    public static void main(String[] args) {
        List<String> strings = List.of("Apple", "Kewi", "Orange", "Apricot", "Mango");
        List<String> filteredAndLowercase = filterAndConvertToLowercase(strings);

        System.out.println("Filtered and lowercase strings starting with 'A':");
        filteredAndLowercase.forEach(System.out::println);;

    }

    public static List<String> filterAndConvertToLowercase(List<String> strings) {
        return strings.stream().filter(s -> s.startsWith("A")).map(String::toLowerCase).collect(Collectors.toList());


    }
}
