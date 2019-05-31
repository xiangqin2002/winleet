package number447;

import java.util.HashMap;
import java.util.Map.Entry;

public class Solution {
	
    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        
        for(int i = 0; i < points.length; i++){
        	HashMap<Integer, Integer> map = new HashMap<>();
        	for(int j = 0; j < points.length; j++){
        		if(i != j){
        			int distance = distance(points[i], points[j]);
        			if(map.containsKey(distance))
        				map.put(distance, map.get(distance) + 1);
        			else
        				map.put(distance, 1);
        		}
        	}
        	
            for (Entry<Integer, Integer> entry : map.entrySet()) {
            	res += entry.getValue() * (entry.getValue() - 1);
            }
        }
        
        return res;
    }
    
    private int distance(int[] a, int[] b){
    	return (a[0] - b[0]) * (a[0] - b[0]) + (a[1] - b[1]) * (a[1] - b[1]);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
