package number202;

import java.util.HashSet;

public class Solution {
	private int happy(int n, HashSet<Integer> set){
		System.out.println(n);
		if(n == 1)
			return 1;
		
		int sum = 0;
		while(n % 10 != 0 || n / 10 != 0){
			System.out.println(n % 10);
			sum += (n % 10) * (n % 10);
			n = n / 10;
			System.out.println(sum + " " + n);
			
		}
		
		System.out.println();
		
		if(set.contains(sum))
			return 0;
		
		set.add(sum);
		return happy(sum, set);
	}
	
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        return happy(n, set) == 1 ? true : false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		System.out.println(s.isHappy(19));
	}

}
