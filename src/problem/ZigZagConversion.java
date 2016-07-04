package problem;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by DZCVT40 on 4.7.2016.
 */
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (s.length() == 0) {
            return "";
        }
        Map<Integer, String> rowMap = new HashMap<>();
        for (int i = 1; i <= s.length(); i++) {
            if (rowMap.get(i % (numRows + (numRows - 2))) != null) {
                rowMap.put(i % (numRows + (numRows - 2)), rowMap.get(i % (numRows + (numRows - 2))) + s.charAt(i - 1));

            } else {
                rowMap.put(i % (numRows + (numRows - 2)), Character.toString(s.charAt(i - 1)));
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            builder.append(rowMap.get(i));
        }
        return builder.toString();
    }
}
