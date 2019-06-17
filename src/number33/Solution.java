package number33;

public class Solution {
	
    public int search(int[] nums, int target) {
    	int l = 0;
    	int r = nums.length - 1;
    	int tmid = 0;
    	
    	boolean rr = false;
    	boolean ll = false;
    	boolean lend = false;
    	boolean end = false;
    	
        if(nums.length == 0)
            return -1;
    	
    	tmid = nums[l + (r - l) / 2];
    	
    	while(true){
    		if(end && l > r)
    			break;
    		
    		int mid = l + (r - l) / 2;
//    		tmid = nums[mid];
    		
    		System.out.println(mid + " " + l + " " + r + " " + ll + " " + rr + " t " + tmid + " " + nums[mid]);
    		if(l >= r && nums[mid] != target && !end){
    			System.out.println(mid + " " + lend);
    			if(lend){
	    			l = (nums.length - 1) / 2 + 1;
	    			r = nums.length - 1;
    			}
    			else{
    				l = 0;
    				r = (nums.length - 1) / 2 - 1;
    			}
    			tmid = nums[l + (r - l) / 2];
    			end = true;
    			continue;
    		}
    		
    		if(target > nums[mid] && ll && !end)
    			r = mid - 1;
    		
    		if(target < nums[mid] && rr && !end)
    			l = mid + 1; 			
    		
    		rr = false;
    		ll = false;
    		mid = l + (r - l) / 2;
    		
    		if(nums[mid] == target)
    			return mid;
    		else if(nums[mid] > target){
    			r = mid - 1;
    			System.out.println(" " + l + " " + r);
    			rr = true;
    			lend = true;
    		}
    		else{
    			l = mid + 1;
    			ll = true;
    		}
    		tmid = nums[mid];
    	}
    	return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[] nums = {4,5,6,7,0,1,2};
		System.out.println(s.search(nums, 0));
	}

}
