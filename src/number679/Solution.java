package number679;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int findShortestSubArray(int[] nums) {
    	int[] index = findIndex(nums);
        return findMin(index, nums);
    }
    
    private int[] findIndex(int[] nums){
    	int[] f = new int[50000];
    	for(int i = 0; i < nums.length; i++)
    		f[nums[i]]++;
    	int max = 0;
    	int index = 0;
    	List<Integer> lindex = new ArrayList<>();
    	for(int i = 0; i < f.length; i++)
    		if(f[i] > max){
    			max = f[i];
    			index = i;
    			lindex.clear();
    			lindex.add(index);
    		}
    		else if(f[i] == max){
    			lindex.add(i);
    		}
    	int[] res = new int[lindex.size() + 1];
    	for(int i = 0; i < lindex.size(); i++)
    		res[i] = lindex.get(i);
    	res[lindex.size()] = max;
    	return res;
    }
    
    private int findMin(int[] index, int[] nums){
    	int first = 0;
    	int last = nums.length - 1;
    	int min = 50000;
    	for(int i = 0; i < index.length - 1; i++){
	    	while(nums[first] != index[i])
	    		first++;
	    	while(nums[last] != index[i])
	    		last--;
	    	if(last - first + 1 < min)
	    		min = last - first + 1;
	    	first = 0;
	    	last = nums.length - 1;
    	}
    	return min;
    }
    
//    private int findMin(int[] index, int[] nums){
//    	int min = 50000;
//    	int max = 0;
//    	int maxNumber = index[index.length - 1];
//    	for(int i = 0; i < index.length - 1; i++){
//    		for(int k = 0; k < nums.length - maxNumber + 1; k++){
//	    		for(int j = k; j < nums.length; j++){
//	    			if(nums[j] == index[i])
//	    				max++;
//	    			if(max == maxNumber){
//	    				if(j - k + 1 < min)
//	    					min = j - k + 1;
//	    				break;
//	    			}
//	    		}
//	    		max = 0;
//    		}
//    	}
//    	return min;
//    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[] t = {2, 1};
		System.out.println(s.findShortestSubArray(t));
	}

}
