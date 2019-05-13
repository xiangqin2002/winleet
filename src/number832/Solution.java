package number832;

public class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i = 0; i < A.length; i++)
            fan(A, i);
            
        return A;
    }
    
    private void fan(int[][] A, int i){
        int l = 0;
        int r = A[i].length - 1;
        while(l < r){
            int t = A[i][l];
            A[i][l] = A[i][r];
            A[i][r] = t;
            l++;
            r--;
            for(int jj = 0; jj < A[i].length; jj++){
                System.out.print(A[i][jj] + " ");
            }
            System.out.println();
        }

        for(int j = 0; j < A[i].length; j++){
            if(A[i][j] == 1)
                A[i][j] = 0;
            else
                A[i][j] = 1;
        }
//        for(int j = 0; j < A[i].length; j++){
//            System.out.print(A[i][j] + " ");
//        }
//        System.out.println();
//        System.out.println();
    }
    
    public static void main(String[] args){
    	Solution s = new Solution();
    	int[][] a = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
    	s.flipAndInvertImage(a);
    }
}