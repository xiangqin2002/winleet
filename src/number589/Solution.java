package number589;

import java.util.ArrayList;
import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};

public class Solution {
	List<Integer> res = new ArrayList<>();
	
    public List<Integer> preorder(Node root) {
    	if(root == null)
    		return res;
        preOrd(root);
        return res;
    }
    
    private void preOrd(Node node){
    	if(node != null)
    		res.add(node.val);
    	
    	if(node.children != null)
    		for(int i = 0; i < node.children.size(); i++)
    		preOrd(node.children.get(i));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
