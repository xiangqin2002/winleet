package number102;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
 
 class Pair {
	 TreeNode node;
	 Integer i;
	 
	 Pair(TreeNode node, Integer i){
		 this.node = node;
		 this.i = i;
	 }
	 
	 public TreeNode getNode(){
		 return this.node;
	 }
	 
	 public Integer getI(){
		 return this.i;
	 }
 }

public class Solution {
	
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<>();
		if(root == null)
			return res;
		
		Queue<Pair> q = new LinkedList<>();
		Pair p = new Pair(root, 0);
		q.add(p);
		while(!q.isEmpty()){
			TreeNode node = q.peek().getNode();
			Integer level = q.peek().getI();
			q.poll();
			
			if(level == res.size()){
				List<Integer> newlist = new ArrayList<>();
				res.add(newlist);
			}
			
			res.get(level).add(node.val);
			
			if(node.left != null)
				q.add(new Pair(node.left, level + 1));
			if(node.right != null)
				q.add(new Pair(node.right, level + 1));
		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
