package test;

import org.junit.Test;
import problem.WaterAndJug;

import static org.junit.Assert.*;

/**
 * Created by DZCVT40 on 27.6.2016.
 */
public class WaterAndJugTest {
    @Test
    public void canMeasureWater() throws Exception {
        WaterAndJug problem = new WaterAndJug();
        assertTrue(problem.canMeasureWater(3,5,4));
        assertTrue(problem.canMeasureWater(34,5,6));
        assertFalse(problem.canMeasureWater(0,2,1));
        assertFalse(problem.canMeasureWater(2,0,1));
        assertTrue(problem.canMeasureWater(1,0,0));
        assertTrue(problem.canMeasureWater(11,3,13));
        assertTrue(problem.canMeasureWater(13,11,1));
        assertFalse(problem.canMeasureWater(6,9,1));
        assertTrue(problem.canMeasureWater(22003,31237,1));
        assertTrue(problem.canMeasureWater(104659,104677,142424));
    }

}