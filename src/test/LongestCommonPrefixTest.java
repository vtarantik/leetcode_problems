package test;

import org.junit.Test;
import problem.LongestCommonPrefix;

import static org.junit.Assert.*;

/**
 * Created by DZCVT40 on 13.7.2016.
 */
public class LongestCommonPrefixTest {
    @Test
    public void longestCommonPrefix() throws Exception {
        LongestCommonPrefix problem = new LongestCommonPrefix();
        assertEquals("",problem.longestCommonPrefix(new String[]{}));
        assertEquals("a",problem.longestCommonPrefix(new String[]{"a"}));
        assertEquals("a",problem.longestCommonPrefix(new String[]{"a","a"}));
        assertEquals("",problem.longestCommonPrefix(new String[]{"","abcd","abcd"}));
        assertEquals("abcd",problem.longestCommonPrefix(new String[]{"abcd","abcd","abcd"}));
        assertEquals("a",problem.longestCommonPrefix(new String[]{"abcd","aabcd","aaabcd"}));
        assertEquals("",problem.longestCommonPrefix(new String[]{"abcd","babcd","aaabcd"}));
        assertEquals("abcd",problem.longestCommonPrefix(new String[]{"abcd","abcde","abcdef","abcdefg"}));
    }

}