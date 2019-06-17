package number24;

 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }


public class Solution {
	
    public ListNode swapPairs(ListNode head) {
        ListNode dummyhead = new ListNode(0);
        dummyhead.next = head;
        ListNode p = dummyhead;
        
        while(p.next != null && p.next.next != null){
        	ListNode node1 = p.next;
        	ListNode node2 = node1.next;
        	ListNode next = node2.next;
        	
        	p.next = node2;
        	node2.next = node1;
        	node1.next = next;
        	p = node1;
        }
        
        ListNode retNode = dummyhead.next;
        dummyhead.next = null;
        return retNode;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
