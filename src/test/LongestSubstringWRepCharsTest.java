package test;

import problem.LongestSubstringWRepChars;

import static org.junit.Assert.*;

/**
 * Created by DZCVT40 on 23.6.2016.
 */
public class LongestSubstringWRepCharsTest {
    @org.junit.Test
    public void lengthOfLongestSubstring() throws Exception {
        LongestSubstringWRepChars algorithm = new LongestSubstringWRepChars();
        assertEquals(algorithm.lengthOfLongestSubstring("abcabcbb"), 3);
        assertEquals(algorithm.lengthOfLongestSubstring("aab"), 2);
        assertEquals(algorithm.lengthOfLongestSubstring("dvdf"), 3);//3
        assertEquals(algorithm.lengthOfLongestSubstring("cdd"), 2);
        assertEquals(algorithm.lengthOfLongestSubstring("abba"), 2);
        assertEquals(algorithm.lengthOfLongestSubstring("anviaj"), 5);
    }

}