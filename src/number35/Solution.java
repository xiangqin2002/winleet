package number35;

public class Solution {
	
    public int searchInsert(int[] nums, int target) {
    	
    	int res = -1;
    	int l = 0;
    	int r = nums.length - 1;
    	
    	while(l <= r){
    		int mid = l + (r - l) / 2;
    		if(nums[mid] == target){
    			res = mid;
    			break;
    		}
    		else if(nums[mid] < target)
    			l = mid + 1;
    		else
    			r = mid - 1;
    	}
    	
    	if(res != -1)
    		return res;
    	
    	for(int i = 0; i < nums.length; i++){
    		if(target < nums[i]){
    			res = i;
    			break;
    		}
    	}
    	
    	if(res == -1)
    		return nums.length;
    	
    	return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[] t = {1};
		System.out.println(s.searchInsert(t, 1));
	}

}
