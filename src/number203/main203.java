package number203;

public class main203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 6, 3, 4, 5, 6};
		ListNode head = new ListNode(nums);
		System.out.println(head);
		
		ListNode res = (new Solution2()).removeElements(head, 6);
		System.out.println(res);
	}

}
