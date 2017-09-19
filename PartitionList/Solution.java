package PartitionList;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode x1 = new ListNode(1);
		ListNode x2 = new ListNode(4);
		ListNode x3 = new ListNode(3);
		ListNode x4 = new ListNode(2);
		ListNode x5 = new ListNode(5);
		ListNode x6 = new ListNode(2);
		x1.next = x2;
		x2.next = x3;
		x3.next = x4;
		x4.next = x5;
		x5.next = x6;

		Solution test = new Solution();
		ListNode res = test.partition(x1, 3);
	}

	public ListNode partition(ListNode head, int x) {
		ListNode less = new ListNode(0);
		ListNode greater = new ListNode(0);
		ListNode pointer1 = less;
		ListNode pointer2 = greater;

		while (head != null) {
			if (head.val < x) {
				pointer1.next = head;
				pointer1 = head;
			} else {
				pointer2.next = head;
				pointer2 = head;
			}
			head = head.next;
		}
		//此时两个指针分别指向各自链表的末端
		pointer2.next = null;
		pointer1.next = greater.next;
		
		return less.next;
	}
}
