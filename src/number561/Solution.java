package number561;

import java.util.Arrays;

public class Solution {
    public int arrayPairSum(int[] nums) {
    	Arrays.sort(nums);
    	int sum = 0;
    	for(int i = nums.length - 2; i >= 0;){
    		sum += nums[i];
    		i = i - 2;
    	}
        return sum;
    }
    

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = {1, 4, 3, 2};
		System.out.println(s.arrayPairSum(nums));
	}

}
