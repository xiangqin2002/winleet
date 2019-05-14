package number83;

import java.util.TreeSet;
import java.util.Set;

class ListNode {
    int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
    	Set<Integer> set = new TreeSet<>();
    	while(node != null){
    		set.add(node.val);
    		node = node.next;
    	}
    	ListNode res = new ListNode(0);
    	node = res;
    	for(int i : set){
            System.out.println(i);
    		ListNode next = new ListNode(0);
    		next.val = i;
    		node.next = next;
            node = next;
    	}
    	return res.next;  
    }
    
    public static void main(String[] args){
    	Set<Integer> s = new TreeSet<>();
    	s.add(-3);
    	s.add(-1);
    	s.add(0);
    	s.add(0);
    	s.add(0);
    	s.add(3);
    	s.add(3);
    	for(int ss: s)
    		System.out.println(ss);
    	System.out.println(s);
    }
}
