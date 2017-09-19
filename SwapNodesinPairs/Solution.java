package SwapNodesinPairs;

//Given 1->2->3->4, you should return the list as 2->1->4->3.
//
//Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed. 

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
		ListNode res = test.swapPairs(x1);
	}

	public ListNode swapPairs(ListNode head) {
		ListNode dummyHead = new ListNode(-1);
		dummyHead.next = head;
		ListNode curr = dummyHead;

		while (curr.next != null && curr.next.next != null) {
			ListNode first = curr.next;
			ListNode second = curr.next.next;
			first.next = second.next;
			curr.next = second;
			curr.next.next = first;
			curr = curr.next.next;
		}
		return dummyHead.next;

	}

}
