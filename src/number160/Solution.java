package number160;

import java.util.HashSet;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }

public class Solution {
	
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode cura = headA;
        ListNode curb = headB;
        
        HashSet<ListNode> set = new HashSet<>();
        
        while(cura != null){
        	set.add(cura);
        	cura = cura.next;
        }
        
        while(curb != null){
        	if(set.contains(curb))
        		return curb;
        	curb = curb.next;
        }
        
        return null;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
