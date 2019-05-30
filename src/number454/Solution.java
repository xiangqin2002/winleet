package number454;

import java.util.HashMap;

public class Solution {
	
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        
        for(int i = 0; i < A.length; i++)
        	for(int j = 0; j < B.length; j++){
        		if(map.containsKey(A[i] + B[j]))
        			map.put(A[i] + B[j], map.get(A[i] + B[j]) + 1);
        		else
        			map.put(A[i] + B[j], 1);
        		}
        
        for(int i = 0; i < C.length; i++)
        	for(int j = 0; j < D.length; j++){
        		if(map.containsKey(-C[i] - D[j]))
        			res += map.get(-C[i] - D[j]);
        	}
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
