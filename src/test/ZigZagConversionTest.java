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
        assertEquals("PAHNAPLSIIGYIR",problem.convert("PAYPALISHIRING",3));
        assertEquals("PINALSIGYAHRPI",problem.convert("PAYPALISHIRING",4));
        assertEquals("PHGASIYIRPLIAN",problem.convert("PAYPALISHIRING",5));
        assertEquals("PRAIIYHNPSGAIL",problem.convert("PAYPALISHIRING",5));
    }

}