package number143;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
	
    public void reorderList(ListNode head) {
        if(head == null)
            return;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        
        // ����ָ�����м���p��pǰ��һ�Σ�qǰ������
        ListNode p = dummyHead;
        ListNode q = dummyHead.next;
        
        boolean odd = true;
        
        while(q != null){
        	p = p.next;
        	q = q.next;
        	if(q != null){
        		q = q.next;
                if(q == null)
                    odd = false;
            }
        }
        
        ListNode middle = p;
        
        // ���ú�벿������
        if(!odd)
        	middle = middle.next;
        
        ListNode pre = null;
        ListNode cur = middle;
    	while(cur != null){
    		ListNode next = cur.next;
    		cur.next = pre;
    		pre = cur;
        	cur = next;
    	}
    	
    	middle = pre;
    	// ��һ��������ͺ�벿���������θ�ȡһ��
    	q = dummyHead.next;
    	ListNode next = dummyHead.next;
    	while(q != p){
    		next = q.next;
    		q.next = middle;
    		q = next;
    		next = middle.next;
    		middle.next = q;
    		middle = next;
    	}
    	
    	middle.next = p;
    	if(odd)
    		p.next = null;
    	else
    		p.next.next = null; 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
