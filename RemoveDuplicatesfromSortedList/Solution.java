package RemoveDuplicatesfromSortedList;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode x1 = new ListNode(1);
		ListNode x2 = new ListNode(2);
		ListNode x3 = new ListNode(3);
		ListNode x4 = new ListNode(3);
		ListNode x5 = new ListNode(5);

		x1.next = x2;
		x2.next = x3;
		x3.next = x4;
		x4.next = x5;

		Solution test = new Solution();
		ListNode res = test.deleteDuplicates(x1);

	}

	public ListNode deleteDuplicates(ListNode head) {
		ListNode dummyhead = new ListNode(0);
		dummyhead.next = head;
		while (head != null && head.next != null) {
			if (head.val == head.next.val) {
				head.next = head.next.next;
			} else {
				head = head.next;
			}
		}
		return dummyhead.next;
	}

}
