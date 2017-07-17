package puzzle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * This is case-insensitive and disregards spaces
 */
public class Palindrome {
    public static boolean isPalindrome(String word) {
        if (word == null || word.length() == 0)
            return false;
        if (word.length() == 1)
            return true;
        word = word.toLowerCase();
        word = word.replaceAll(" ", "");
        if (word.length() == 2 && word.charAt(0) == word.charAt(1))
            return true;
        int end = word.length() - 1;
        for (int start = 0; start <= end; start++) {
            if (word.charAt(start) != word.charAt(end))
                return false;
            end--;
        }
        return true;
    }

    @Test
    public void testPalindrome() {
        // Case insensitivity
        Assertions.assertEquals(true, isPalindrome("Deleveled"));
        // Many words
        Assertions.assertEquals(true, isPalindrome("Animal loots foliated detail of stool lamina"));
        // Wrong
        Assertions.assertEquals(false, isPalindrome("Hello world!"));
    }
}
