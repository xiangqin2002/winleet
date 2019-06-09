package number219;

import java.util.HashSet;

public class Solution {
	
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    	HashSet<Integer> set = new HashSet<>();
    	for(int i = 0; i < nums.length; i++){
        	if(set.contains(nums[i]))
        		return true;
        	
        	set.add(nums[i]);
        	
        	if(set.size() == k + 1)
        		set.remove(nums[i - k]);
        }
    	return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
