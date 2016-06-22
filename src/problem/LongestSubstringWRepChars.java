package problem;

import java.util.HashMap;

/**
 * Created by DZCVT40 on 22.6.2016.
 */
public class LongestSubstringWRepChars {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null)
            return 0;

        int longest = 0;
        HashMap<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if(charMap.containsKey(currentChar)){
                if(charMap.size()>longest){
                    longest = charMap.size();
                }
                i = charMap.get(currentChar);
                charMap.clear();

            }else{
                charMap.put(currentChar,i);
            }
        }

        return Math.max(longest, charMap.size());
    }
}
