package number415;

public class Solution {
	
    public String addStrings(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        
        char[] n1 = num1.toCharArray();
        char[] n2 = num2.toCharArray();
        
        boolean nn1 = len1 < len2 ? true : false;
        int mix = len1 < len2 ? len1 : len2;
        boolean f = false;
        int sum = 0;
        
        String res = "";
        
    	for(int i = 0; i < n1.length / 2; i++){
    		char t = n1[i];
    		n1[i] = n1[n1.length - 1 - i];
    		n1[n1.length - 1 - i] = t;
    	}
    	
    	for(int i = 0; i < n2.length / 2; i++){
    		char t = n2[i];
    		n2[i] = n2[n2.length - 1 - i];
    		n2[n2.length - 1 - i] = t;
    	}
        
        if(nn1){
        	for(int i = 0; i < mix; i++){
        		sum = Integer.parseInt(n1[i] + "") + Integer.parseInt(n2[i] + "");
        		if(f){
        			sum++;
        			f = false;
        		}
        		if(sum >= 10){
        			f = true;
        			sum = sum % 10;
        		}
        		n2[i] = (char)(sum + '0');
        	}
        	for(int i = mix; i < len2; i++){
        		sum = Integer.parseInt(n2[i] + "");
        		if(f){
        			sum++;
        			f = false;
        		}
        		if(sum >= 10){
        			f = true;
        			sum = sum % 10;
        		}
        		n2[i] = (char)(sum + '0');
        	}
        	
        	for(int i = 0; i < n2.length / 2; i++){
        		char t = n2[i];
        		n2[i] = n2[n2.length - 1 - i];
        		n2[n2.length - 1 - i] = t;
        	}
        	
        	res = String .valueOf(n2);
        	
        	if(f)
        		res = "1" + String.valueOf(n2);      		
        }
        else{
        	for(int i = 0; i < mix; i++){
        		sum = Integer.parseInt(n1[i] + "") + Integer.parseInt(n2[i] + "");
        		if(f){
        			sum++;
        			f = false;
        		}
        		if(sum >= 10){
        			f = true;
        			sum = sum % 10;
        		}
        		n1[i] = (char)(sum + '0');
        	}
        	for(int i = mix; i < len1; i++){
        		sum = Integer.parseInt(n1[i] + "");
        		if(f){
        			sum++;
        			f = false;
        		}
        		if(sum >= 10){
        			f = true;
        			sum = sum % 10;
        		}
        		n1[i] = (char)(sum + '0');
        	}
        	
        	for(int i = 0; i < n1.length / 2; i++){
        		char t = n1[i];
        		n1[i] = n1[n1.length - 1 - i];
        		n1[n1.length - 1 - i] = t;
        	}
        	
        	res = String .valueOf(n1);
        	
        	if(f)
        		res = "1" + String.valueOf(n1);   
        }
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		System.out.println(s.addStrings("696", "30"));
	}

}
