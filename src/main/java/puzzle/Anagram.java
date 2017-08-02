package puzzle;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static boolean isAnagram(String word, String testWord) {
        if (word == null || testWord == null || word.trim().length() == 0 || testWord.trim().length() == 0)
            return false;

        word = formatStringForComparison(word);
        testWord = formatStringForComparison(testWord);
        if (word.trim().length() != testWord.trim().length())
            return false;

        Map<Character, Integer> wordMap = new HashMap<>();
        for (int startTest = 0; startTest < testWord.length(); startTest++) {
            if (wordMap.containsKey(testWord.charAt(startTest))) {
                int count = wordMap.get(testWord.charAt(startTest)) + 1;
                wordMap.put(testWord.charAt(startTest), count);
            }
            wordMap.put(testWord.charAt(startTest), 1);
        }
        for (int start = 0; start < word.length(); start++) {
            if (wordMap.containsKey(word.charAt(start))) {
                int count = wordMap.get(testWord.charAt(start)) - 1;
                wordMap.put(testWord.charAt(start), count);
            }
        }

        for (Map.Entry<Character, Integer> entry : wordMap.entrySet()) {
            if (entry.getValue() > 0)
                return false;
        }
        return true;
    }

    private static String formatStringForComparison(String string) {
        if (string == null)
            return null;
        return string.replaceAll(" ", "").replaceAll("[^0-9a-zA-Z]+", "").trim().toLowerCase();
    }
}
