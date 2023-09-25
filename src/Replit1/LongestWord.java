package Replit1;
//Create the maxLength method that will accept String array of words and return the word with the largest length.
//
//Method should visible only within same package!
//
//**Expected Output:**
//
//```
//this is long
class LongestWord {

        public static void main(String[] args) {
            String[] words = {"hey", "yolo", "hi", "this is long"};
            String longest = maxLength(words);
            System.out.println(longest);
            // Output: "this is long"
        }
    public static String maxLength(String[] words) {
        if (/*words == null ||*/ words.length == 0) {
            return null;//// Handle empty or null input

        }
        String longestWord = words[0];
        for (String word : words) {
            if (word != null && word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
    }

