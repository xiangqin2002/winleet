package number1295;

public class Solution {
	
    public int findNumbers(int[] nums) {
        int res = 0;
        
        for(int i = 0; i < nums.length; i++) {
        	int c = 0;
        	int t = nums[i];
        	while(t != 0) {
        		c++;
        		t /= 10;
        	}
        	if(c % 2 == 0) {
        		res++;
        		System.out.println(nums[i]);
        	}
        }
        
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
