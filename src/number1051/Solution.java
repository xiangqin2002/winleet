package number1051;

public class Solution {
	
    public int heightChecker(int[] heights) {
    	int tem[] = heights.clone();
    	for(int i = 0; i < tem.length; i++){
    		for(int j = 0; j < tem.length - i - 1; j++){
    			if(tem[j] > tem[j + 1]){
	    			int t = tem[j];
	    			tem[j] = tem[j + 1];
	    			tem[j + 1] = t;
    			}
    		}
    	}

    	int res = 0;
    	for(int i = 0; i < tem.length; i++)
    		if(tem[i] != heights[i])
    			res++;
    	return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int t[] = {7,3,5,5,1,2,2,3,9,2,2,7,1,7,3,2,3,6,6,7};
		s.heightChecker(t);
	}

}
