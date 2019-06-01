package number475;

import java.util.Arrays;
import java.util.TreeSet;

public class Solution {
	
    public int findRadius(int[] houses, int[] heaters) {
//        TreeSet<Integer> set = new TreeSet<>();
        int counter = 0;
        Arrays.sort(houses);
        Arrays.sort(heaters);
        if(heaters.length == 1)
        	counter = Math.max(houses[houses.length - 1] - heaters[0], 
        			heaters[0] - houses[0]);
        else{
        	counter = Math.max(heaters[0] - houses[0], 
	        		houses[houses.length - 1] - heaters[heaters.length - 1]);
	        for(int i = 1; i < heaters.length; i++){
	        	int tem = 0;
	        	tem = (heaters[i] - heaters[i - 1] - 1) / 2;
	        	counter = Math.max(counter, tem);
//	        	System.out.println(counter + " " + houses[i] + " " + houses[i - 1]);
	        }
        }
 //边界情况要做特殊处理       	
//        	if(i == 0){
//        		for(int j = heaters[i]; j > houses[0]; j--)
//        			counter++;
//        		
//        		set.add(houses[i]);
//        		for(int k = heaters[i] + 1; k < heaters[i] + 1 + counter; k++){
//        			set.add(k);
//        		}
////        		System.out.println(counter + set.toString());
//        	}
////        	System.out.println(counter);
//        	else{
//	        	int tem = 0;
//	        	for(int k = houses[i]; k > houses[i - 1] && !set.contains(houses[i]); k--){
//	        		tem++;
////	        		System.out.println(tem + " " + houses[i]);
//	        	}
////	        	System.out.println(tem);
//	        	counter = Math.max(counter, tem);
//	        	tem = 0;
//	        	
//	        	if(i == heaters.length - 1){
//	            	for(int k = houses[i]; k < houses.length; k++)
//	            		tem++;
//	            	counter = Math.max(counter, tem);
//	        	}
//	        	else{
//		        	for(int k = houses[i] + 1; k < houses[i] + 1 + counter; k++)
//		        		set.add(k);
//	        	}
//        	}
//    	}
        return counter;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[] nums1 = {282475249,622650073,984943658,144108930,470211272,101027544,457850878,458777923};
		int[] nums2 = {823564440,115438165,784484492,74243042,114807987,137522503,441282327,16531729,823378840,143542612};
		System.out.println(s.findRadius(nums1, nums2));
	}

}
