package number100;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

public class Solution {
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
    	List<String> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();
        
    	preOrder(p, l1);
    	preOrder(q, l2);
    	
    	if(l1.size() != l2.size())
    		return false;
    	
    	int length = l1.size();
    	
    	for(int i = 0; i < length; i++){
    		if(!l1.get(i).equals(l2.get(i)))
    			return false;
    	}
    	
    	return true;
    }
    
    private void preOrder(TreeNode node, List<String> l){
    	if(node == null){
    		l.add("null");
    		return;
    	}
    	
    	l.add(node.val + "");
    	preOrder(node.left, l);
    	preOrder(node.right, l);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
