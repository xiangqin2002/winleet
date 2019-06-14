package number82;

import java.util.HashMap;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
	
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyhead = new ListNode(0);
        ListNode cur = dummyhead;
        dummyhead.next = head;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        while(cur.next != null){
        	if(!map.containsKey(cur.next.val))
        		map.put(cur.next.val, 1);
        	else
        		map.put(cur.next.val, map.get(cur.next.val) + 1);
        	cur = cur.next;
        }
        cur = dummyhead;
        
        while(cur.next != null){
        	if(map.get(cur.next.val) > 1){
        		ListNode delNode = cur.next;
        		cur.next = delNode.next;
        		delNode.next = null;
        	}
        	else
        		cur = cur.next;
        }
        ListNode retNode = dummyhead.next;
        dummyhead.next = null;
        return retNode;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
