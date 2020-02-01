package number1025;

public class Solution {
	
    public boolean divisorGame(int N) {
        boolean res = false;
        
        boolean p = true;
        boolean e = true;
        
        // 选出任一 x，满足 0 < x < N 且 N % x == 0 。
        //		用 N - x 替换黑板上的数字 N 。
        while(e) {
        	e = false;
	        for(int i = 1; i < N; i++) {
	        	if(N % i == 0) {
	        		if(p) {
	        			p = false;
	        			res = true;
	        		}
	        		else {
	        			p = true;
	        			res = false;
	        		}
	        		
	        		N -= i;
	        		e = true;
	        		
	        		break;
	        	}
	        }
        }
        
        return res;		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
