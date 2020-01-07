package number1290;

 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

public class Solution {
	
    public int getDecimalValue(ListNode head) {
        int res = 0;
        int len = 0;
        ListNode tem = head;
        
        while(tem != null) {
        	len++;
        	tem = tem.next;
        }
        
        while(head != null) {
        	if(head.val == 0) {
        		len--;
        		head = head.next;
        		continue;
        	}

        	res += Math.pow(2, --len);
        	head = head.next;
        }
        
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
