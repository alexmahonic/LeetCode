package RotateList;
//Given a list, rotate the list to the right by k places, where k is non-negative.
//Ex: {1,2,3} k=2 Move the list after the 1st node to the front//
//Ex: {1,2,3} k=5, In this case Move the list after (3-5%3=1)st node to the front.
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode x1 = new ListNode(1);
		ListNode x2 = new ListNode(2);
		ListNode x3 = new ListNode(3);
		ListNode x4 = new ListNode(4);
		ListNode x5 = new ListNode(5);
		ListNode x6 = new ListNode(6);
		x1.next = x2;
		x2.next = x3;
		x3.next = x4;
		x4.next = x5;
		x5.next = x6;
		
		Solution test = new Solution();
		ListNode res = test.rotateRight(x1, 3);

	}

	public ListNode rotateRight(ListNode head, int k) {
//		ListNode dummyHead = new ListNode(-1);
//		dummyHead.next = head;		
		if (head == null || head.next == null) {
			return head;
		}
		
		ListNode curr = head;
		ListNode res = null;
		int length = 0;

		while (curr != null && curr.next != null) {
			curr = curr.next;
			length++;
		}
//		次数指针curr指向的是最后一个非空的元素，但是length的值是小于数列的总长度的，所以要length++
		length++;
		
		curr.next = head; //最后一个元素指向头结点
		
//		当k大于总长度length的时候，取余
//		Ex: {1,2,3} k=5, In this case Move the list after (3-5%3=1)st node to the front.
		int rest = length - k % length;
		for (int i = 1; i <= rest; i++) {
			curr = curr.next;
		}
		res = curr.next;
		curr.next = null;
		
		return res;
		
	}
}
