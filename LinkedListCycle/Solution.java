package LinkedListCycle;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public boolean hasCycle(ListNode head){
		Set<ListNode> temp = new HashSet<ListNode>();
		while (head != null){
			if(temp.contains(head)){
				return true;
			}else {
				temp.add(head);
			}
			head = head.next;
		}
		return false;
	}

}
//����hash set�����ж��Ƿ�֮ǰ��������Ԫ��