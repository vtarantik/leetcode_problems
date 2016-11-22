package problem;

/**
 * Created by DZCVT40 on 21.11.2016.
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0||nums==null){
            return 0;
        }
        int min = nums[0];
        int minIndex = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]>min){
                nums[++minIndex] = nums[i];
                min = nums[i];
            }
        }
        return minIndex+1;
    }

}
