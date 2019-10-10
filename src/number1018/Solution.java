package number1018;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
    public List<Boolean> prefixesDivBy5(int[] A) {
    	List<Boolean> res = new ArrayList<>();
    	int sum = 0;
    	
        for(int i = 0; i < A.length; i++) {
        	sum *= 2;
        	sum += A[i];
        	sum %= 10;
        	
        	if(sum % 5 == 0)
        		res.add(true);
        	else
        		res.add(false);
        }
        
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
