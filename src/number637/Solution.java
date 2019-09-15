package number637;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Pair{
	TreeNode node;
	int level;
	
	Pair(TreeNode node, int level){
		this.node = node;
		this.level = level;
	}
	
	public TreeNode getNode(){
		return this.node;
	}
	
	public int getLevel(){
		return this.level;
	}
}

 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

public class Solution {
	
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        if(root == null)
        	return res;
        
        int count = 0;
        double temSum = 0;
        
        Queue<Pair> q = new LinkedList<>();
        
        q.add(new Pair(root, 0));
        
        while(!q.isEmpty()){
        	TreeNode node = q.peek().getNode();
        	int level = q.peek().getLevel();
        	q.poll();
        	
        	if(level > res.size()){
        		res.add(temSum / count);
        		count = 0;
        		temSum = 0;
        	}
        	
    		temSum += node.val;
    		count++;
        	
        	if(node.left != null)
        		q.add(new Pair(node.left, level + 1));
        	if(node.right != null)
        		q.add(new Pair(node.right, level + 1));
        }
        
        res.add(temSum / count);
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
