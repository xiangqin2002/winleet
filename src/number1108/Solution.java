package number1108;

public class Solution {
	
    public String defangIPaddr(String address) {
    	int l = address.length();
    	int count = 0;
    	for(int i = 0; i < l; i++)
    		if(address.charAt(i) == '.')
    			count++;
    	
    	int length = l + count * 2;
    	char r[] = new char[length];
    	int offset = 0;
    	for(int i = 0; i < l; i++){
    		if(address.charAt(i) == '.'){
    			r[i + offset++] = '[';
    			r[i + offset++] = '.';
    			r[i + offset] = ']';
    			continue;
    		}
    		r[i + offset] = address.charAt(i);
    	}
    	String res = String.copyValueOf(r);
    	return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
