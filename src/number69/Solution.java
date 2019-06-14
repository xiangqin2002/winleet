package number69;

public class Solution {
	
    public int mySqrt(int x) {
    	int res = 0;
    	if(x == 1)
    		return 1;
        for(int i = 0; i < x; i++){
        	if((long)i * (long)i > x)
        		return res;
        	res = i;
        }
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
