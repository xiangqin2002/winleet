package number961;

import java.util.TreeMap;

public class Solution {
    public int repeatedNTimes(int[] A) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int N = A.length / 2;
        for(int i = 0; i < A.length; i++){
        	if(!map.containsKey(A[i]))
        		map.put(A[i], 1);
        	else
        		map.put(A[i], map.get(A[i]) + 1);
        }
        for (Integer key : map.keySet()) {
            if(map.get(key) == N)
            	return key;
        }
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ii = {1,2,3,3};
		Solution s = new Solution();
		System.out.println(s.repeatedNTimes(ii));
	}

}
