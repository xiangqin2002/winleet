package number92;


  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
  
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode dhead = null;
        ListNode phead = null;
        ListNode next = cur.next; 
        int c = 1;
        
        while(c <= n){
        	if(c == m){
        		phead = pre;
        		dhead = cur;
        	}
        	
        	if(c >= m + 1){
        		cur.next = pre;
        		pre = cur;
        		cur = next;
        		if(next != null)
        			next = next.next;
        	}
        	else{
	        	pre = cur;
	        	cur = next;
	        	if(cur != null)
	        		next = next.next;
        	}
        	c++;
        	if(c == n + 1){
        		dhead.next = cur;
        		if(phead != null)
        			phead.next = pre;
        		else
        			head = pre;
        	}
        }
        return head;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
