package problem;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by DZCVT40 on 4.7.2016.
 */
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (s.length() == 0 || numRows == 0) {
            return "";
        }
        if (numRows == 1) {
            return s;
        }
        boolean backwards = false;
        char current;
        int pointer = 0;
        String[] strings = new String[numRows];
        for (int i = 0; i < s.length(); i++) {
            current = s.charAt(i);
            if (strings[pointer] == null) {
                strings[pointer] = Character.toString(current);
            } else {
                strings[pointer] += current;
            }
            if (backwards) {
                if (pointer == 0) {
                    pointer++;
                    backwards = false;
                } else {
                    pointer--;
                }
            } else {
                if (pointer == numRows - 1) {
                    pointer--;
                    backwards = true;
                } else {
                    pointer++;
                }
            }
        }
        String result = "";
        for (String partialString: strings) {
            if (partialString != null) {
                result += partialString;
            }
        }
        return result;
    }
}
