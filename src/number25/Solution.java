package number25;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
	
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummyhead = new ListNode(0);
        dummyhead.next = head;
        ListNode p = dummyhead;
        
        boolean f = true;
        
        List<ListNode> list = new ArrayList<>();
        list.add(p);
        while(f){
        	for(int i = 0; i < k; i++){
        		ListNode node = list.get(i).next;
        		if(node != null)
        			list.add(node);
        		else{
        			f = false;
        			break;
        		}
    		}
        }
        return head;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
