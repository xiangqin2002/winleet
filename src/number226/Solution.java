package number226;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
	
    public TreeNode invertTree(TreeNode root) {
        pre(root);
        return root;
    }
    
    private void pre(TreeNode node) {
    	if(node == null)
    		return;
    	TreeNode tem;
    	tem = node.right;
    	node.right = node.left;
    	node.left = tem;
    	pre(node.left);
    	pre(node.right);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
