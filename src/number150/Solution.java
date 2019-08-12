package number150;

import java.util.Stack;

public class Solution {
	
    public int evalRPN(String[] tokens) {
    	if(tokens.length == 1)
    		return Integer.parseInt(tokens[0]);
    	
        Stack<String> s = new Stack<>();
        int res = 0;
        for(String c : tokens){
        	if(c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")){
        		String s1 = s.peek();
        		s.pop();
        		String s2 = s.peek();
        		s.pop();
        		int i1 = Integer.parseInt(s1);
        		int i2 = Integer.parseInt(s2);
        		switch(c){
        			case "+" : res = i2 + i1; break;
        			case "-" : res = i2 - i1; break;
        			case "*" : res = i2 * i1; break;
        			case "/" : res = i2 / i1; break;
        		}
        		s.add(String.valueOf(res));
        	}
        	else{
        		s.add(c);
        	}
        }
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
