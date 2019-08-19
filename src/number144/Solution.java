package number144;

import java.util.ArrayList;
import java.util.List;

 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

public class Solution {
	List<Integer> res = new ArrayList<>();
	
    public List<Integer> preorderTraversal(TreeNode root) {
    	preOrder(root);
    	return res;
    }
    
    private void preOrder(TreeNode node){
    	if(node != null){
    		res.add(node.val);
    		preOrder(node.left);
    		preOrder(node.right);
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
