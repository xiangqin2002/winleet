package number1064;

public class Solution {
	
    public int fixedPoint(int[] A) {
        for(int i = 0; i < A.length; i++)
        	if(A[i] == i)
        		return i;
        return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
