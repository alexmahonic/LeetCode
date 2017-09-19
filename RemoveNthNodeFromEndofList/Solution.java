package RemoveNthNodeFromEndofList;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode x1 = new ListNode(1);
		ListNode x2 = new ListNode(2);
		ListNode x3 = new ListNode(3);
		ListNode x4 = new ListNode(4);
		ListNode x5 = new ListNode(5);

		x1.next = x2;
		x2.next = x3;
		x3.next = x4;
		x4.next = x5;
		
		ListNode head = x1;
		
		Solution test = new Solution();
		ListNode res = test.removeNthFromEnd(head, 2);
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummyhead = new ListNode(0);
		dummyhead.next = head;
		int length = 0;
		ListNode pointer = head;

		while (pointer != null) {
			length++;
			pointer = pointer.next;
		}
		
//		要删除的倒数第n个元素是正数第length-n+1个元素，key指向的是该元素的前一个元素。
		int key = length - n;
		pointer = dummyhead;

		while (key > 0) {
			pointer = pointer.next;
			key--;
		}
		pointer.next = pointer.next.next;
		return dummyhead.next;
	}

}
