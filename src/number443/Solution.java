package number443;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
	
    public int compress(char[] chars) {
    	int res = 1;
    	char c = '9';
    	int k = 0;
    	int ci = 0;
    	for(int i = 0; i < chars.length; i++){
    		if(chars[i] != c){
    			if(k >= 1){
    				if(k > 1){
		    			String number = String.valueOf(k);
		    			for(int j = 0; j < number.length(); j++){
		    				chars[++ci] = number.charAt(j);
		    				res++;
		    			}
    				}
	    			chars[++ci] = chars[i];
	    			res++;
    			}
    			k = 1;
    			c = chars[i];
    		}
    		else{
    			k++;
    			if(i == chars.length - 1){
//    				chars[++ci] = chars[i];
//	    			res++;
        			String number = String.valueOf(k);
	    			for(int j = 0; j < number.length(); j++){
	    				chars[++ci] = number.charAt(j);
	    				res++;
	    			}
    			}
    		}
    		for(Character s: chars)
    			System.out.print(s + " ");
    		System.out.println(k);
    	}
//        TreeMap<Character, Integer> map = new TreeMap<>();
//    	for(int i = 0; i < chars.length; i++){
//        	if(map.containsKey(chars[i]))
//        		map.put(chars[i], map.get(chars[i]) + 1);
//        	else
//        		map.put(chars[i], 1);
//    	}
//    	int i = -1;
//    	for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//    		chars[++i] = entry.getKey();
//    		System.out.println(entry.getKey() + " " + entry.getValue());
//
//    		res++;
//    		if(entry.getValue() != 1){
//    			String number = String.valueOf(entry.getValue());
//    			for(int k = 0; k < number.length(); k++){
//    				chars[++i] = number.charAt(k);
//    				res++;
//    			}
//    		}
//    		for(Character c: chars)
//    			System.out.print(c + " ");
//    		System.out.println();
//    	}
    	return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
//		char[] c = {'a','a','b','b','c','c','c'};
		char[] c = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
		System.out.println(s.compress(c));
	}

}
