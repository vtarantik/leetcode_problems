package test;

import org.junit.Test;
import problem.RemoveDuplicatesFromSortedArray;

import static org.junit.Assert.*;

/**
 * Created by DZCVT40 on 21.11.2016.
 */
public class RemoveDuplicatesFromSortedArrayTest {
    @Test
    public void removeDuplicates() throws Exception {
        RemoveDuplicatesFromSortedArray problem = new RemoveDuplicatesFromSortedArray();
        assertEquals("1,1,2",2,problem.removeDuplicates(new int[]{1,1,2}));
        assertEquals("1,1,2,3,4,5,6,7,8,9,10,11,12",12,problem.removeDuplicates(new int[]{1,1,2,3,4,5,6,7,8,9,10,11,12}));
    }

}