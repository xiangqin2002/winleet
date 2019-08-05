package number61;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}

public class Solution {
	
    public ListNode rotateRight(ListNode head, int k) {
    	if(k <= 0 || head == null)
    		return head;
    	
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        
        int length = 0;
        
        while(head != null){
        	length++;
        	head = head.next;
        }
        
        int count = k % length;
        
        int start = 0;
        int dis = length - count;
        
        ListNode p = dummyHead;
        ListNode q = null;
        
        for(; start < dis; start++)
        	p = p.next;
        
        for(q = p; q.next != null; q = q.next);
        
    	q.next = dummyHead.next;
    	ListNode retNode = p.next;
    	p.next = null;
    	
    	dummyHead = null;
    	
    	return retNode;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
