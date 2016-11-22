package test;

import org.junit.Test;
import problem.StringToInteger;

import static org.junit.Assert.*;

/**
 * Created by DZCVT40 on 14.7.2016.
 */
public class StringToIntegerTest {
    @Test
    public void myAtoi() throws Exception {
        StringToInteger problem = new StringToInteger();
        assertEquals(0,problem.myAtoi("-      "));
        assertEquals(1,problem.myAtoi("+1"));
        assertEquals(-1,problem.myAtoi("-1"));
        assertEquals(0,problem.myAtoi("      "));
        assertEquals(0,problem.myAtoi("- 123"));
        assertEquals(-123,problem.myAtoi("-123"));
        assertEquals(-123,problem.myAtoi(" -123    "));
        assertEquals(123,problem.myAtoi(" 123    "));
        assertEquals(12,problem.myAtoi(" 12 3    "));
        assertEquals(Integer.MAX_VALUE,problem.myAtoi("30000000000000000000000000000"));
        assertEquals(Integer.MIN_VALUE,problem.myAtoi("-30000000000000000000000000000"));
        assertEquals(0,problem.myAtoi("-asdasdasdasda"));
        assertEquals(0,problem.myAtoi("0asdasdasdasda"));

    }

}