package number145;

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
	
    public List<Integer> postorderTraversal(TreeNode root) {
    	postOrder(root);
    	return res;
    }
    
    private void postOrder(TreeNode node){
    	if(node != null){
    		postOrder(node.left);
    		postOrder(node.right);
    		res.add(node.val);
    	}
    }

}
