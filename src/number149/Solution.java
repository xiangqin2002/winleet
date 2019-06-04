package number149;

import java.util.HashMap;

public class Solution {
	
//    public int maxPoints(int[][] points) {
//    	int max = 1;
//    	int n = points.length;
//    	HashMap<> map = new HashMap<>();
//        for(int i = 0; i < n; i++)
//        	for(int j = i + 1; j < n; j++){
//        		int disx = points[i][0] - points[j][0];
//        		int disy = points[i][1] - points[j][1];
//        		int gcd = get_gcd(disy, disx);
//        		int y = disy / gcd;
//        		int x = disx / gcd;
//        		for(int k = j + 1; k < n; k++){
//        			if(){
//        				
//        			}
//        			else{
//        				
//        				map.put(y, x);
//        			}
//        		}
//        	}
//    }
    
    private int get_gcd(int n1, int n2) {
        int gcd = 0;
        if (n1 < n2) {// ½»»»n1¡¢n2µÄÖµ
            n1 = n1 + n2;
            n2 = n1 - n2;
            n1 = n1 - n2;
        }

        if (n1 % n2 == 0) {
            gcd = n2;
        }

        while (n1 % n2 > 0) {
            n1 = n1 % n2;

            if (n1 < n2) {
                n1 = n1 + n2;
                n2 = n1 - n2;
                n1 = n1 - n2;
            }

            if (n1 % n2 == 0) {
                gcd = n2;
            }
        }
        return gcd;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
