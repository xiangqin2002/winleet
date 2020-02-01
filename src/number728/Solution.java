package number728;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
    public List<Integer> selfDividingNumbers(int left, int right) {
    	
    	List<Integer> res = new ArrayList<>();
    	
        for(int i = left; i <= right; i++) {
        	int tem = i;
        	boolean judge = true;
        	for(; tem != 0;) {
        		int t = tem % 10;
        		if(t == 0){
        			judge = false;
        			break;
        		}
        		if(i % t != 0) {
        			judge = false;
        			break;
        		}
        		tem /= 10;
        	}
        	if(judge)
        		res.add(i);
        }
        
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(198 / 10);
	}

}
