package problem;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by DZCVT40 on 22.6.2016.
 */
public class LongestSubstringWRepChars {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int longest = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            longest = Math.max(longest, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return longest;
    }
}
