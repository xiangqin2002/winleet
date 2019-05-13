package number929;
import java.util.ArrayList;
import java.util.TreeSet;
public class Solution {
    public int numUniqueEmails(String[] emails) {
        TreeSet<String> ret = new TreeSet<>();
        for(String email: emails){
            ArrayList<Character> list = new ArrayList<>();
            int indexAt = 0;
            for(int i = 0; i < email.length(); i++)
                if(email.charAt(i) == '@'){
                    indexAt = i;
                    break;
            }
            for(int i = 0; i <= indexAt; i++){
                if(email.charAt(i) == '+')
                    break;
                if(email.charAt(i) != '.')
                    list.add(email.charAt(i));
            }
            for(int i = indexAt; i < email.length(); i++)
                list.add(email.charAt(i));
            
            char[] c = new char[list.size()];
            for(int k = 0; k < list.size(); k++)
            	c[k] = list.get(k);
            String res = new String(c);
            ret.add(res);
            
        }
        return ret.size();
    }
    
    public static void main(String[] args){
    	String[] tt= {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
    	Solution s = new Solution();
    	System.out.println(s.numUniqueEmails(tt));
    	
    }
}
