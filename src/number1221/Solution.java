package number1221;

public class Solution {
	
    public int balancedStringSplit(String s) {
    	int res = 0;
    	char c = s.charAt(0);
    	for(int i = 0; i < s.length();) {
    		int n = 0;
    		for(int j = 0; j < i; j++) {
    			if(s.charAt(j) == c)
    				n++;
    		}
    		if(n == i / 2)
    			res++;
    		i += 2;
    	}
    	
    	return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
