package number438;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int n = p.length();
        int[] tem = new int[26];
        for(int i = 0; i < n; i++){
        	System.out.println(p.charAt(i) + " " + (p.charAt(i) - 97));
        	tem[p.charAt(i) - 97]++;
        }
        for(int i = 0; i < s.length() - n + 1; i++){
        	for(int j = 0; j < n; j++){
    			if(tem[s.charAt(i + j) - 97] != 0)
    				tem[s.charAt(i + j) - 97]--;
    			else
    				break;
    			if(j == n - 1)
    				res.add(i);
        	}
            for(int k = 0; k < 26; k++)
            	tem[k] = 0;
            for(int k = 0; k < n; k++)
            	tem[p.charAt(k) - 97]++;
        }
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		String ss = "abab";
		String p = "ab";
		System.out.println(s.findAnagrams(ss, p).toString());
	}

}
