import java.util.Arrays;

public class KthLargest {
    public int findKthLargest(int[] nums,int k){
        Arrays.sort(nums);
        System.out.println(nums[nums.length-k]);
        return nums[nums.length-k];
    }
}
