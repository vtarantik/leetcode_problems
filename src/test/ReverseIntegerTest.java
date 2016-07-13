package test;

import org.junit.Test;
import problem.ReverseInteger;

import static org.junit.Assert.*;

/**
 * Created by DZCVT40 on 13.7.2016.
 */
public class ReverseIntegerTest {
    @Test
    public void reverse() throws Exception {
        ReverseInteger problem = new ReverseInteger();
        assertEquals(-321,problem.reverse(-123));
        assertEquals(0,problem.reverse(1000000003));
        assertEquals(3,problem.reverse(000000003));
        assertEquals(3,problem.reverse(300000000));

    }

}