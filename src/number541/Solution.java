package number541;

public class Solution {
    public String reverseStr(String s, int k) {
    	char[] cc = s.toCharArray();
    	int n = 2 * k;
    	int l = 0;
    	int m = 0;
    	if(k < 2)
    		m = 0;
    	else
    		m = k % 2 == 0 ? k / 2 : k / 2 + 1;
    	for(int i = 0; i < s.length();){
    		if(s.length() - i < n){
    			
    			l = 0;
    			if(s.length() - i < k){
    				for(int j = i; j < i + (s.length() - i) / 2; j++){
    					char c = cc[j];
    					cc[j] = cc[s.length() - 1 - l];
    					cc[s.length() - 1 - l] = c;
    					l++;
    				}
    			}
    			else{
    	   			for(int j = i; j < i + m; j++){
        				char c = cc[j];
        				cc[j] = cc[i + k - 1 - l];
        				cc[i + k - 1 - l] = c;
        				l++;
        			}
    			}
    			break;
    		}
    		l = 0;
    		for(int j = i; j < i + m; j++){
				char c = cc[j];
				cc[j] = cc[i + k - 1 - l];
				cc[i + k - 1 - l] = c;
				l++;
    		}
    		i += n;
    	}
    	
    	return String.valueOf(cc);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		String str = "fdcqkmxwholhytmhafpesaentdvxginrjlyqzyhehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl";
		System.out.println(str.length());
		System.out.println(s.reverseStr(str, 39));
	}

}
