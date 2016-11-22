package problem;

/**
 * Created by DZCVT40 on 21.11.2016.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0||nums==null){
            return 0;
        }
        int numsIndex = 0;
        for(int i =0; i<nums.length;i++){
            if(nums[i]!=val){
                nums[numsIndex++] = nums[i];
            }
        }
        return numsIndex;
    }
}
