package IntersectionofTwoLinkedLists;


//			
//			A:          a1 ¡ú a2
//								¨K
//			  					c1 ¡ú c2 ¡ú c3
//								¨J            
//			B:     b1 ¡ú b2 ¡ú b3

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


		ListNode y1 = new ListNode(4);
		ListNode y2 = new ListNode(5);
		ListNode y3 = new ListNode(8);
		ListNode y4 = new ListNode(9);
		ListNode y5 = new ListNode(10);
		y1.next = y2;
		y2.next = y3;
		y3.next = y4;
		y4.next = y5;
		
		Solution test = new Solution();
		ListNode res = test.getIntersectionNode(x1, y1);

	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		int lengthA = getLength(headA);
		int lengthB = getLength(headB);

		if (headA == null || headB == null) {
			return null;
		}
		if (lengthA > lengthB) {
			for (int i = 0; i < lengthA - lengthB; i++) {
				headA = headA.next;
			}
		} else {
			for (int i = 0; i < lengthB - lengthA; i++) {
				headB = headB.next;
			}
		}
		
		while(headA.val != headB.val && headA != null && headB != null){
			headA = headA.next;
			headB = headB.next;
		}
		return (headA != null && headB != null) ? headA : null;
	}

	public int getLength(ListNode head) {
		int len = 0;
		while (head != null) {
			head = head.next;
			len++;
		}
		return len;
	}

}
