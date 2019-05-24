package number205;

import java.util.HashMap;

public class Solution {
	
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> mapt = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
        	char c;
        	if(map.containsKey(s.charAt(i))){
        		c = map.get(s.charAt(i));
        		if(c != t.charAt(i))
        			return false;
        	}
        	else{
        		if(mapt.containsKey(t.charAt(i)))
        			return false;
        		map.put(s.charAt(i), t.charAt(i));
        		mapt.put(t.charAt(i), s.charAt(i));
        	}
        	
        }
        
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		System.out.println(s.isIsomorphic("ab", "ca"));
	}

}
