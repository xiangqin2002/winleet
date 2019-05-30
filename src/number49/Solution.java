package number49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Solution {
	
    public List<List<String>> groupAnagrams(String[] strs) {
    	List<List<String>> res = new ArrayList<>();
    	List<String> l = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(int i = 0; i < strs.length; i++){
        	char[] sStr = strs[i].toCharArray();
        	Arrays.sort(sStr);
//        	System.out.println(map.toString() + "   " + sStr);
        	if(map.containsKey(String.valueOf(sStr))){
//        		System.out.println(map.get(String.valueOf(sStr)));
        		List<String> stringl = map.get(String.valueOf(sStr));
//        		System.out.println(stringl.toString() + " " + strs[i]);
        		stringl.add(strs[i]);
        		map.put(String.valueOf(sStr), stringl);
//        		System.out.println(map.get(String.valueOf(sStr)));
        	}
        	else{
        		map.put(String.valueOf(sStr), new ArrayList(Arrays.asList(strs[i])));
        	}
        }
        
        for (Entry<String, List<String>> entry : map.entrySet()) {
        	res.add(entry.getValue());
        }
        
        return res;
    }
    
    private boolean isAnagram(String s, String t) {
    	if(s.length() != t.length())
    		return false;
    	
    	char[] sStr = s.toCharArray();
    	char[] tStr = t.toCharArray();
    	
    	Arrays.sort(sStr);
    	Arrays.sort(tStr);
    	
    	if(!String.valueOf(sStr).equals(String.valueOf(tStr)))
    		return false;
    	
        return true;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		String[] ss = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(s.groupAnagrams(ss));
//		System.out.println(s.isAnagram("ete", "eat"));
//		
//		HashMap<String, List<String>> map = new HashMap<>();
//		map.put("aa", Arrays.asList("aa", "bb"));
//		System.out.println(map.toString());
	}

}
