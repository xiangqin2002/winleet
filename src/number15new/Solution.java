package number15new;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        Arrays.sort(nums);	//-2 -1 0 1 2 3
        for(int i = 0; i < nums.length - 2; i++){
        	if(i >= 1 && nums[i] == nums[i - 1])
        		continue;
        	int complement = -nums[i];
        	twoSum(nums, complement, i, res);
        }     
        return res;
    }
    
    private void twoSum(int[] nums, int complement, int k, List<List<Integer>> res){
    	System.out.println(k);
    	int i = k + 1;
    	int j = nums.length - 1;
    	while(i < j){
    		List<Integer> l = new ArrayList<>();
    		if(nums[i] + nums[j] > complement){
    			j--;
    			continue;
    		}
    		else if(nums[i] + nums[j] < complement){
    			i++;
    			continue;
    		}
    		else {
    			l.add(nums[k]);
    			l.add(nums[i]);
    			l.add(nums[j]);
//    			System.out.println(l.toString());
//    			if(!judgeDuplication(res, l)){
    				res.add(l);
//    			}
    			while(i + 1 < j && nums[i] == nums[i + 1])
    				i++;
    			while(j - 1 > i && nums[j - 1] == nums[j])
    				j--;
    		}
    		i++;
    		j--;
    	}
    }
    
//    private boolean judgeDuplication(List<List<Integer>> r, List<Integer> res){
//    	for(int i = 0; i < r.size(); i++)
//    		if(intersect(r.get(i), res))
//    			return true;
//    	return false;
//    }
//    
//    private boolean  intersect(List ls1, List ls2) {
//    	if(ls1.size() != ls2.size())
//    		return false;
//    	
//    	System.out.println(ls1 + " " + ls2 + " aa");
//    	int l1 = 0;
//    	int l2 = 0;
//		for(int i = 0; i < ls1.size(); i++)
//			if(ls2.contains(ls1.get(i)))
//				l1++;
//		
//		for(int i = 0; i < ls1.size(); i++)
//			if(ls1.contains(ls2.get(i)))
//				l2++;
//		
//		return l1 == l2 && l2 == ls1.size(); 
//    }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[] nums = {3,0,-2,-1,1,2};
		System.out.println(s.threeSum(nums).toString());
	}

}
