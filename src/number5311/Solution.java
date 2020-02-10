package number5311;

public class Solution {
	
    public int numberOfSteps (int num) {
    	int res = 0;
    	
    	while(num != 0) {
    		if(num % 2 == 0)
    			num /= 2;
    		else
    			num -= 1;
    		res++;
    	}
    	
    	return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
