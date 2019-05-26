package number451;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
        	if(map.containsKey(s.charAt(i)))
        		map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
        	else
        		map.put(s.charAt(i), 1);
        }
        
        List<Character> l = new ArrayList<>();
        char key = 'c';
        while(!map.isEmpty()){
		    key = findM(map);
		    for(int i = 0; i < map.get(key); i++)
		    	l.add(key);
		    map.remove(key);
        }
        char[] r = new char[l.size()];
        for(int i = 0; i < l.size(); i++){
        	r[i] = l.get(i);
        }
        StringBuffer str5 = new StringBuffer();
        for (Character s1 : r) {
            str5.append(s1);
        }
        return str5.toString();
    }
    
    private char findM(HashMap<Character, Integer> map){
    	char c = '0';
    	int max = 0;
    	for(Map.Entry<Character, Integer> entry : map.entrySet()){
    		System.out.println(entry.getKey() + " " + entry.getValue() + " " + max);
    		if(entry.getValue() >= max){
    			max = entry.getValue();
    			c = entry.getKey();
    		}	
    	}
    	System.out.println(c);
    	return c;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		String res = s.frequencySort("raaeaedere");
		for(int i = 0; i < res.length(); i++)
			System.out.print(res.charAt(i));
	}

}
