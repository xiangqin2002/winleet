package number849;

public class Solution {
	
    public int maxDistToClosest(int[] seats) {
        int max = 0;
        int l1 = 0;
        int l2 = 0;
        boolean j1 = false;
        boolean j2 = false;
        for(int i = 0; i < seats.length; i++){
        	j1 = false;
        	j2 = false;
        	if(seats[i] == 0){
        		l1 = 1;
        		if(i - 1 < 0)
        			j1 = true;
        		for(int j = i - 1; j >= 0; j--){
        			if(seats[j] != 1){
        				if(j == 0){
        					j1 = true;
        				}
        				l1++;
        			}
        			else
        				break;
        		}
        		l2 = 1;
        		if(i + 1 >= seats.length)
        			j2 = true;
        		for(int j = i + 1; j < seats.length; j++){
        			if(seats[j] != 1){
        				if(j == seats.length - 1){
        					j2 = true;
        				}
        				l2++;
        			}
        			else
        				break;
        		}
        		System.out.println(l1 + " " + l2 + " j1 " + j1 + " j2 " + j2);
        		if(j1)
        			l1 = l2;
        		if(j2)
        			l2 = l1;
        		System.out.println(l1 + " " + l2 + " o");
        		max = Math.max(max, Math.min(l1, l2));
        	}
        }
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
//		int[] seats = {1, 0, 0, 0};
		int[] seats = {1,0,0,0,1,0,1};
		System.out.println(s.maxDistToClosest(seats));
	}

}
