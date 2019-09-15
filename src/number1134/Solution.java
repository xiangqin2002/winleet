package number1134;

public class Solution {
	
    public boolean isArmstrong(int N) {
        int sum = 0;
        int T = N;
        int k = 1;
        
        while(T / 10 != 0){
        	k++;
        	T /= 10;
        }
        System.out.println(k);
        
        T = N;
        
        while(T / 10 != 0){
        	int t = T % 10;
        	sum += (int) Math.pow(t, k);
        	T /= 10;
        	System.out.println(t);
        }
    	int t = T % 10;
    	sum += (int) Math.pow(t, k);;
        if(sum == N)
        	return true;
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		s.isArmstrong(153);
	}

}
