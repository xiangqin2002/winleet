package number557;

public class Solution {
	
    public String reverseWords(String s) {
    	String[] res = s.split(" ");
    	StringBuilder r = new StringBuilder("");
    	for(int i = 0; i < res.length; i++){
    		for(int j = 0; j < res[i].length() / 2; j++){
    			char[] tt = res[i].toCharArray();
    			char t = res[i].charAt(j);
    			tt[j] = tt[res[i].length() - 1 - j];
    			tt[res[i].length() - 1 - j] = t;
    			res[i] = String.valueOf(tt);
    		}
    		if(i == res.length - 1)
    			r.append(res[i]);
    		else
    			r.append(res[i] + " ");
    	}
        return r.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		String str = "Let's take LeetCode contest";
		System.out.println(s.reverseWords(str));
	}
}
