import org.junit.Assert;
import org.junit.Test;
import puzzle.Anagram;
import puzzle.Palindrome;

public class Tests {

    @Test
    public void testPalindrome() {
        Assert.assertTrue(Palindrome.isPalindrome("Ee"));
        // Case insensitivity
        Assert.assertTrue(Palindrome.isPalindrome("Deleveled"));
        // Many words
        Assert.assertTrue(Palindrome.isPalindrome("Animal loots foliated detail of stool lamina"));
        // Wrong
        Assert.assertFalse(Palindrome.isPalindrome("Hello world!"));
    }

    @Test
    public void testAnagram() {
        Assert.assertTrue(Anagram.isAnagram(" Mother-in-law", "Woman Hitler"));
        Assert.assertTrue(Anagram.isAnagram("These churn air", "The Hurricanes"));
        Assert.assertTrue(Anagram.isAnagram("Conversation", "Voices rant on"));
        Assert.assertFalse(Anagram.isAnagram("dflkj", "ioj-09sdf"));
        Assert.assertFalse(Anagram.isAnagram("hello there", "dolly faces"));
        Assert.assertFalse(Anagram.isAnagram("wtf", "wtd"));
        Assert.assertFalse(Anagram.isAnagram("wtf", "wtdyooo"));
        Assert.assertFalse(Anagram.isAnagram("wtfooo", "wtd"));
    }
}
