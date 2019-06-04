package number821;

public class Solution {
	
    public int[] shortestToChar(String S, char C) {
    	int[] res = new int[S.length()];
        for(int i = 0; i < S.length(); i++){
        	int d1 = 10000;
        	int d2 = 10000;
        	if(S.charAt(i) != C){
        		if(i + 1 < S.length()){
        			d1 = 1;
	        		for(int j = i + 1; j < S.length(); j++){

	        			if(S.charAt(j) == C)
	        				break;
	        			else{

	        				if(j == S.length() -1){
	        					
	        					d1 = 10000;
	        					break;
	        				}
	        				d1++;
	        			}
	        		}
        		}
        		if(i - 1 >= 0){
        			d2 = 1;
	        		for(int j = i - 1; j >= 0; j--){
	        			if(S.charAt(j) == C)
	        				break;
	        			else{
	        				if(j == 0){
	        					d2 = d1;
	        					break;
	        				}
	        				d2++;
	        			}
	        		}
        		}
//        		System.out.println(d1 + " " + d2);
        		res[i] = Math.min(d1, d2);
        	}
        	else{
        		res[i] = 0;
        	}
        }
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		String S = "islxy";
		char C = 'i';
		int[] res = s.shortestToChar(S, C);
		for(Integer i: res)
			System.out.print(i + " ");
	}

}
