package number229;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
    	int max = (int) Math.floor(nums.length / 3);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
        	if(map.containsKey(nums[i]))
        		map.put(nums[i], map.get(nums[i]) + 1);
        	else
        		map.put(nums[i], 1);
        }
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        	if(entry.getValue() > max)
        		res.add(entry.getKey());
        }
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[] nums = {1, 2};
		System.out.println(s.majorityElement(nums));
	}

}
