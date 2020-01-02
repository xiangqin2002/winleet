package lcp_1;

public class Solution {

    public int game(int[] guess, int[] answer) {
        int res = 0;
    	for(int i = 0; i < answer.length; i++) {
        	if(guess[i] == answer[i])
        		res++;
        }
    	return res;
    }

}
