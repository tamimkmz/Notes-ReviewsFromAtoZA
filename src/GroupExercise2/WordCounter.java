package GroupExercise2;
/*Count the Number of Words in a String: Write a function to count the
number of words in a given string. Words are separated by spaces or
punctuation. For example, the input "Hello, world!" should return 2.*/
public class WordCounter {
    public static void main(String[] args) {
        String input="Hello, World!";
        int wordCount = countWords(input);
        System.out.println("Number of word in the string: "+ wordCount);
    }

    public static int countWords(String input) {
        String[] words = input.split(" ");

        return words.length;
    }
}
