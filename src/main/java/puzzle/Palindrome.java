package puzzle;

/**
 * This is case-insensitive and disregards spaces
 */
public class Palindrome {
    public static boolean isPalindrome(String word) {
        if (word == null || word.length() == 0)
            return false;

        word = word.toLowerCase();
        word = word.replaceAll(" ", "");
        if (word.length() == 1)
            return true;
        int end = word.length() - 1;
        for (int start = 0; start <= end; start++) {
            if (word.charAt(start) != word.charAt(end))
                return false;
            end--;
        }
        return true;
    }


}
