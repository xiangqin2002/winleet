package number1304;

public class Solution {
	
    public int[] sumZero(int n) {
    	int[] res = new int[n];
    	if(n == 1) {
    		res[0] = 0;
    		return res;
    	}
    	
    	res[0] = -n;
    	int s = n;
    	for(int i = 1; i < n; i++) {
    		if(i == n - 1){
    			res[i] = s;
    			break;
    		}
    		res[i] = res[i - 1] + 1;
    		s += -res[i];
    	}
    	return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
