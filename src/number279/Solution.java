package number279;

import java.util.LinkedList;
import java.util.Queue;

class Pair {
	 Integer i1;
	 Integer i2;
	 
	 Pair(Integer i1, Integer i2){
		 this.i1 = i1;
		 this.i2 = i2;
	 }
	 
	 public Integer getI1(){
		 return this.i1;
	 }
	 
	 public Integer getI2(){
		 return this.i2;
	 }
}

public class Solution {
	
    public int numSquares(int n) {
		Pair p = new Pair(n, 0);
		Queue<Pair> q = new LinkedList<>();
		q.add(p);
		
		boolean visited[] = new boolean[n + 1];
		visited[n] = true;
		for(int i = 0; i < n; i++)
			visited[i] = false;
		
		while(!q.isEmpty()){
			int num = q.peek().i1;
			int step = q.peek().i2;
			q.poll();
			
			for(int i = 0;; i++){
				int a = num - i * i;
				if(a < 0)
					break;
				if(a == 0)
					return step + 1;
				if(!visited[a]){
					q.add(new Pair(a, step + 1));
					visited[a] = true;
				}
			}
		}
		return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
