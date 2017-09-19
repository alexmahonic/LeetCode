package RemoveDuplicatesfromSortedListII;

//Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
//
//For example,
//Given 1->2->3->3->4->4->5, return 1->2->5.
//Given 1->1->1->2->3, return 2->3. 

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode x1 = new ListNode(1);
		ListNode x2 = new ListNode(2);
		ListNode x3 = new ListNode(3);
		ListNode x4 = new ListNode(3);
		ListNode x5 = new ListNode(4);
		ListNode x6 = new ListNode(4);
		ListNode x7 = new ListNode(5);
		x1.next = x2;
		x2.next = x3;
		x3.next = x4;
		x4.next = x5;
		x5.next = x6;
		x6.next = x7;
		
		Solution test = new Solution();
		ListNode res = test.deleteDuplicates(x1);
	}
	
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyHead = new ListNode(-1);
        ListNode cur = head;
        ListNode pre = dummyHead;
        pre.next = cur;
        
        while (cur != null) {
			while (cur.next != null && cur.val == cur.next.val) {
				cur = cur.next;
			}
			if (pre.next != cur){
				pre.next = cur.next;
				cur = pre.next;
			}else {
				pre = pre.next;
				cur = cur.next;
			}			
		}
        return dummyHead.next;
    }

}
