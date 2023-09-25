package Replit1;

public class surround {
    public static String surround(String s, String search_term) {
        if (s == null || search_term == null || search_term.isEmpty()) {
            return s; // If either s or search_term is null or empty, return the original string.
        }

        StringBuilder result = new StringBuilder();
        int startIndex = 0;
        int searchIndex;

        while ((searchIndex = s.indexOf(search_term, startIndex)) != -1) {
            result.append(s, startIndex, searchIndex); // Append characters before the search_term.
            result.append("(").append(search_term).append(")"); // Surround the search_term with parentheses.
            startIndex = searchIndex + search_term.length(); // Move the startIndex beyond the current search_term.
        }

        // Append any remaining characters after the last search_term.
        if (startIndex < s.length()) {
            result.append(s.substring(startIndex));
        }

        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(surround("abcabcabc", "c")); // Output: "ab(c)ab(c)ab(c)"
        System.out.println(surround("technology", "o")); // Output: "techn(o)l(o)gy"
}}