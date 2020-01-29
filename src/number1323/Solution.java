package number1323;

public class Solution {
	
    public int maximum69Number (int num) {
    	int res = num;
    	
    	String s = Integer.toString(num);
    	
    	for(int i = 0; i < s.length(); i++) {
    		char[] c = s.toCharArray();
    		if(c[i] == '6') 
    			c[i] = '9';
    		else
    			c[i] = '6';
    		
    		int tem = Integer.valueOf(new String(c));
    		res = res > tem ? res : tem;
    	}
    		
    	return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(9996 / 10000);
	}

}
