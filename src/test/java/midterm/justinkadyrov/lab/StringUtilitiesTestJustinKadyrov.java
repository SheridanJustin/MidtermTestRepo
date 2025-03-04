package midterm.justinkadyrov.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse; 

import org.junit.jupiter.api.Test;

public class StringUtilitiesTestJustinKadyrov {

    @Test
    public void testReverseByJustin() {
        StringUtilities util = new StringUtilities(); 
        String reverseString = "racecar";
        assertEquals("racecar", util.reverse(reverseString)); 
        //random comment instert.

    }

    @Test
    public void testReverseFailsByJustin() {
        StringUtilities util = new StringUtilities();
        String reverseString = "hello";
        assertEquals("olleh", util.reverse(reverseString)); 
    }

    @Test
    public void testIsPalindromeByJane() {
        StringUtilities util = new StringUtilities();
        String palindrome = "racecar";
        assertTrue(util.isPalindrome(palindrome)); 
    }

    @Test
    public void testIsPalindromeFails() {
        StringUtilities util = new StringUtilities();
        String notPalindrome = "hello";
        assertFalse(util.isPalindrome(notPalindrome)); 
    }
}
