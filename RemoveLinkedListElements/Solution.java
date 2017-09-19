package RemoveLinkedListElements;

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
		ListNode res = test.removeElements(x1, 8);

	}
    public ListNode removeElements(ListNode head, int val) {
        if (head == null){
        	return null;
        }
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode preNode = dummyHead;
        ListNode curNode = head;
        while (curNode != null) {
			if (curNode.val == val){
				preNode.next = curNode.next;
			}else {
				preNode = preNode.next;
			}
			curNode = curNode.next;
			//preNode和curNode作为两个指针同时向后移动
		}
        return dummyHead.next;
    }

}
