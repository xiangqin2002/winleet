package number1281;

public class Solution {
	
    public int subtractProductAndSum(int n) {
        int n1 = 1;
        int n2 = 0;
        
        while(n != 0) {
        	int t;
        	t = n % 10;
        	n /= 10;
        	n1 *= t;
        	n2 += t;
        }
        
        return n1 - n2;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
