package number905;

public class Solution {
    public int[] sortArrayByParity(int[] A) {
    	int t;
        for(int i = 0; i < A.length; i++){
        	if(A[i] % 2 == 1){
        		for(int j = i + 1; j < A.length; j++){
        			if(A[j] % 2 == 0){
        				t = A[i];
        				A[i] = A[j];
        				A[j] = t;
        				break;
        			}
        		}
        	}
        }
		for(int i: A){
			System.out.print(i + " ");
		}
        return A;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ii = {3,1,2,4};
		Solution s = new Solution();
		ii = s.sortArrayByParity(ii);

	}

}
