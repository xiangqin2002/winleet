package number2;

  class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

class Solution {
   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	   ListNode cur1 = l1;
	   ListNode cur2 = l2;
	   ListNode pre = null;
	   
	   int len1 = 0;
	   int len2 = 0;
	   
	   boolean f = false;
	   
	   while(cur1 != null){
		   len1++;
		   cur1 = cur1.next;
	   }
	   cur1 = l1;
	   
	   while(cur2 != null){
		   len2++;
		   cur2 = cur2.next;
	   }
	   cur2 = l2;
	   
	   int min = len1 < len2 ? 1 : 2;
	   if(min == 1){
		   for(int i = 0; i < len1; i++){
			   int t = cur2.val + cur1.val;
			   if(f){
				   t++;
				   f = false;
			   }
			   if(t >= 10){
				   cur2.val = t % 10;
				   f = true;
			   }
			   else
				   cur2.val = t;
			   if(i == len1 - 1)
				   pre = cur2;
			   cur1 = cur1.next;
			   cur2 = cur2.next;
		   }
		   for(int i = len1; i < len2; i++){
			   int t = cur2.val;
			   if(f){
				   t++;
				   f = false;
			   }
			   if(t >= 10){
				   cur2.val = t % 10;
				   f = true;
			   }
			   else
				   cur2.val = t;
               if(i == len2 - 1)
				   pre = cur2;
			   cur2 = cur2.next;
		   }
		   if(f){
			   ListNode end = new ListNode(1);
			   cur2 = end;
			   pre.next = cur2;
		   }
		   return l2;
	   }
	   else {
		   for(int i = 0; i < len2; i++){
			   int t = cur2.val + cur1.val;
			   if(f){
				   t++;
				   f = false;
			   }
			   if(t >= 10){
				   cur1.val = t % 10;
				   f = true;
			   }
			   else
				   cur1.val = t;
			   if(i == len2 - 1)
				   pre = cur1;
			   cur1 = cur1.next;
			   cur2 = cur2.next;
		   }
		   for(int i = len2; i < len1; i++){
			   int t = cur1.val;
			   if(f){
				   t++;
				   f = false;
			   }
			   if(t >= 10){
				   cur1.val = t % 10;
				   f = true;
			   }
			   else
				   cur1.val = t;
              if(i == len1 - 1)
				   pre = cur1;
			   cur1 = cur1.next;
		   }
		   if(f){
			   ListNode end = new ListNode(1);
			   cur1 = end;
			   pre.next = cur1;
		   }
		   return l1;
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
