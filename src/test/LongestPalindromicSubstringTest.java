package test;

import org.junit.Test;
import problem.LongestPalindromicSubstring;

import static org.junit.Assert.*;

/**
 * Created by DZCVT40 on 22.11.2016.
 */
public class LongestPalindromicSubstringTest {
    @Test
    public void longestPalindrome() throws Exception {
        LongestPalindromicSubstring problem = new LongestPalindromicSubstring();
        assertEquals("babaabab",problem.longestPalindrome("cbabaabab"));
    }

    @Test
    public void isPalindrome() throws Exception {
        LongestPalindromicSubstring problem = new LongestPalindromicSubstring();
        assertTrue(problem.isPalindrome("bab"));
        assertTrue(problem.isPalindrome("baaab"));
        assertTrue(problem.isPalindrome("badaadab"));
    }

}