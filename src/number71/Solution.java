package number71;

import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	Stack<Character> s = new Stack<>();
	
    public String simplifyPath(String path) {
        
        int l = path.length();
        for(int i = 0; i < l; i++){
//        	System.out.print(path.charAt(i));
        	if(path.charAt(i) == '.'){
        		if(i + 1 != l && path.charAt(i + 1) != '/' && path.charAt(i + 1) != '.'||
        				i + 1 != l && path.charAt(i + 1) != '/' && path.charAt(i + 1) != '.' && 
        				i + 2 < l && path.charAt(i + 2) != '/' ||
        				i + 1 != l && path.charAt(i + 1) == '.' &&
        				i + 2 < l && path.charAt(i + 2) != '/' && path.charAt(i + 2) != '.'){
        			System.out.println(i);
        			while(i != l && path.charAt(i) != '/'){
        				s.add(path.charAt(i));
        				i++;
        			}
        			i--;
        			continue;
        		}
        		else if(i + 1 != l && path.charAt(i + 1) == '.'){
        			if(i + 2 != l && path.charAt(i + 2) == '.'){
        				while(i != l && path.charAt(i) == '.'){
        					s.add(path.charAt(i));
        					i++;
        				}
        				i--;
        				continue;
        			}
        			else if(i + 2 != l && path.charAt(i + 2) != '.' && path.charAt(i + 2) != '/'){
        				while(i != l && path.charAt(i) != '/'){
        					s.add(path.charAt(i));
        					i++;
        				}
        				continue;
        			}
        			i++;
        			if(s.size() != 1){
        				s.pop();
        			}
        			while(s.peek() != '/'){
        				s.pop();
        			}
        			if(s.size() != 1){
        				s.pop();
        			}
        		}
        		else if(i + 1 != l && path.charAt(i + 1) == '/'){
        			i++;
        		}
        	}
        	else if(path.charAt(i) == '/'){
        		if(i > 0 && s.peek() == '/'){
        			
        		}
        		else if(i != l - 1){
        			s.add(path.charAt(i));
        		}
        		else if(i == 0 && l == 1){
        			s.add(path.charAt(i));
        		}
        	}
        	else{
        		s.add(path.charAt(i));
        	}
        }
		if(s.size() != 1 && s.peek() == '/'){
			s.pop();
		}
		
		ArrayList<String> a = new ArrayList<>();
		while(s.size() > 0){
			a.add(String.valueOf(s.pop()));
		}
		Collections.reverse(a);
		
		String res = String.join("", a);
		return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution a = new Solution();
//		a.simplifyPath("/a//b////c/d//././/..");
//		System.out.println("/a/../../b/../c//.//");
		System.out.println(a.simplifyPath("/..aa/...hidden/"));
	}

}
