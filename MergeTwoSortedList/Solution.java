package MergeTwoSortedList;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode x1 = new ListNode(2);
		ListNode x2 = new ListNode(3);
		ListNode x3 = new ListNode(4);
		x1.next = x2;
		x2.next = x3;

		ListNode y1 = new ListNode(5);
		ListNode y2 = new ListNode(6);
		ListNode y3 = new ListNode(7);
		y1.next = y2;
		y2.next = y3;
		
		Solution test = new Solution();
		ListNode res = test.mergeTwoLists(x1, y1);

	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2){
//		ListNode head = new ListNode(0);
		if(l1 == null){
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		
		if (l1.val < l2.val){
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		}
		else {
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
		
	}
}
