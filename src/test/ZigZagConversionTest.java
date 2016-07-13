package test;

import org.junit.Test;
import problem.ZigZagConversion;

import static org.junit.Assert.*;

/**
 * Created by DZCVT40 on 4.7.2016.
 */
public class ZigZagConversionTest {
    @Test
    public void convert() throws Exception {
        ZigZagConversion problem = new ZigZagConversion();
        assertEquals("AB",problem.convert("AB",1));
        assertEquals("ABC",problem.convert("ABC",1));
        assertEquals("ABCD",problem.convert("ABCD",1));
        assertEquals("ABCDE",problem.convert("ABCDE",1));
        assertEquals("A",problem.convert("A",2));
        assertEquals("ACB",problem.convert("ABC",2));
        assertEquals("ACBD",problem.convert("ABCD",2));
        assertEquals("",problem.convert("",1));
        assertEquals("PAHNAPLSIIGYIR",problem.convert("PAYPALISHIRING",3));
        assertEquals("PINALSIGYAHRPI",problem.convert("PAYPALISHIRING",4));
        assertEquals("PHASIYIRPLIGAN",problem.convert("PAYPALISHIRING",5));
        assertEquals("PRAIIYHNPSGAIL",problem.convert("PAYPALISHIRING",6));
    }

}