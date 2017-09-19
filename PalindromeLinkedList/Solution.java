package PalindromeLinkedList;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode x1 = new ListNode(1);
		ListNode x2 = new ListNode(2);
		ListNode x3 = new ListNode(3);
		ListNode x4 = new ListNode(3);
		ListNode x5 = new ListNode(2);
		ListNode x6 = new ListNode(1);
		x1.next = x2;
		x2.next = x3;
		x3.next = x4;
		x4.next = x5;
		x5.next = x6;

		Solution test = new Solution();
		boolean res = test.isPalindrome(x1);

	}

	public boolean isPalindrome(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		// 当链表有奇数个元素，slow指向的是中位数，所以要往后移动一个
		if (fast != null) {
			slow = slow.next;
		}

		slow = reverseList(slow);
		fast = head;

		while (slow != null) {
			if (fast.val != slow.val) {
				return false;
			}
			fast = fast.next;
			slow = slow.next;
		}
		return true;
	}

	public ListNode reverseList(ListNode p) {
		ListNode preNode = null;
		ListNode currNode = p;
		ListNode nextTempNode = null;

		while (currNode != null) {
			nextTempNode = currNode.next;
			currNode.next = preNode;
			preNode = currNode;
			currNode = nextTempNode;
		}
		return preNode;
	}
}
