package number9;

import java.util.Stack;

public class Solution {
	
    public boolean isPalindrome(int x) {
        if(x < 0)
        	return false;
        
        Stack<Character> s = new Stack<>();
        
        String sx = String.valueOf(x);
        int n = sx.length() / 2;
        
    	for(int i = 0; i < n; i++)
    		s.add(sx.charAt(i));
    	
    	int i = n;
    	int k = n * 2;
    	if(sx.length() % 2 != 0){
    		i = n + 1;
    		k = n * 2 + 1;
    	}
    	System.out.println(i + " " + n);
    	for(; i < k; i++){
    		System.out.println(s.peek() + " " + sx.charAt(i));
    		if(s.pop() != sx.charAt(i))
    			return false;
    	}
    	return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		System.out.println(s.isPalindrome(100));
	}
}
