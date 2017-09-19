//You are given two non-empty linked lists representing two non-negative integers. 
//The digits are stored in reverse order and each of their nodes contain a single digit. 
//Add the two numbers and return it as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8

package AddTwoNumbers;

public class add_Two_Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode x1 = new ListNode(2);
		ListNode x2 = new ListNode(4);
		ListNode x3 = new ListNode(3);
		x1.next = x2;
		x2.next = x3;

		
		ListNode y1 = new ListNode(5);
		ListNode y2 = new ListNode(6);
		ListNode y3 = new ListNode(4);
		y1.next = y2;
		y2.next = y3;

		add_Two_Integers test = new add_Two_Integers();
		ListNode res = test.addTwoIntegers(x1, y1);

	}

	public ListNode addTwoIntegers(ListNode L1, ListNode L2) {
		ListNode dummyHead = new ListNode(0);
		ListNode x = L1;
		ListNode y = L2;
		ListNode curr = dummyHead;
		int carry = 0;

		if (x == null && y == null) {
			return dummyHead;
		}
		while (x != null || y != null) {
			int a = (x == null) ? 0 : x.val;
			int b = (y == null) ? 0 : y.val;
			int sum = a + b + carry;
			carry = sum / 10;
			curr.next = new ListNode(sum % 10);
			curr = curr.next;
			x = (x == null) ? null : x.next;
			y = (y == null) ? null : y.next;
		}
		if (carry != 0) {
			curr.next = new ListNode(carry);
		}
		return dummyHead.next;
	}

}
