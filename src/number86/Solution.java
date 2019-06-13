package number86;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
	
    public ListNode partition(ListNode head, int x) {
        ListNode thead = new ListNode(0);
        ListNode dhead = null;
        ListNode cur = head;
        ListNode pre = null;
        ListNode next = null;
        thead.next = cur;
        dhead = thead;
        dhead.next = cur;
        pre = dhead;
        pre.next = cur;
//        if(head.val < x){
//        	dhead = cur;
//        	cur = cur.next;
//        }
        
//        boolean f = false;
        
        while(cur != null){
        	next = cur.next;
        	if(cur.val < x){
        		cur.next = dhead.next;
        		dhead.next = cur;
        		dhead = cur;
//        		pre.next = next;
//        		pre = cur;
        		cur = next;
//        		pre = dhead;
        		pre.next = cur;
//        		f = true;
        	}
        	else{
//        		if(!f)
        			pre = cur;
            	cur = next;
//            	f = false;
            	pre.next = cur;
        	}
        }
        return thead.next;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
