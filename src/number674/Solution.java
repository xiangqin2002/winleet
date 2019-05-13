package number674;

public class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int l = 0;
        int r = 0;
        int res = 0;
        while(l < nums.length){
        	if(r + 1 < nums.length && nums[r + 1] > nums[r])
        		r++;
        	else{
        		res = Math.max(res, r - l + 1);
        		r++;
        		l = r;
        	}
        }
        return res;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ii = {1,3,5,4,7};
		Solution s = new Solution();
		System.out.println(s.findLengthOfLCIS(ii));
	}

}
