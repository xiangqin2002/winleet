package number94;

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
	
    public List<Integer> inorderTraversal(TreeNode root) {
    	inOrder(root);
    	return res;
    }
    
    private void inOrder(TreeNode node){
    	if(node != null){
    		inOrder(node.left);
    		res.add(node.val);
    		inOrder(node.right);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
