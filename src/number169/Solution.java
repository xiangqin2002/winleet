package number169;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {
    	int max = 0;
    	int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
        	if(map.containsKey(nums[i]))
        		map.put(nums[i], map.get(nums[i]) + 1);
        	else
        		map.put(nums[i], 1);
        }
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        	if(entry.getValue() > max){
        		max = entry.getValue();
        		res = entry.getKey();
        	}
        }
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
