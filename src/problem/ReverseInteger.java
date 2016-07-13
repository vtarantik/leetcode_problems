package problem;

/**
 * Created by DZCVT40 on 13.7.2016.
 */
public class ReverseInteger {
    public int reverse(int x) {
        boolean negative = x < 0 ? true : false;
        if (negative) {
            x *= -1;
        }

        String stringRepresentation = Integer.toString(x);
        if (stringRepresentation.length() == 1) {
            return x;
        }
        String result = "";
        for (int i = stringRepresentation.length() - 1; i >= 0; i--) {
            result += stringRepresentation.charAt(i);
        }
        int res ;
        try {
            res = Integer.parseInt(result);

        } catch (NumberFormatException ex) {
            return 0;
        }
        if (negative) {
            res *= -1;
        }
        return res;
    }
}
