package DeleteNodeinaLinkedList;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode x1 = new ListNode(1);
		ListNode x2 = new ListNode(2);
		ListNode x3 = new ListNode(3);
		ListNode x4 = new ListNode(8);
		ListNode x5 = new ListNode(9);
		ListNode x6 = new ListNode(10);
		x1.next = x2;
		x2.next = x3;
		x3.next = x4;
		x4.next = x5;
		x5.next = x6;
		
		Solution test = new Solution();
		test.deleteNode(x3);
		ListNode res = x1;
		
	}

	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}

}
