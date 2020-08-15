package org.goutham.solutions;

public class LLIntersection {
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		int list1length = LLLength(headA);
		int list2length = LLLength(headB);
		if(list1length > list2length) {
			return getIntersection(headA, headB);
		}
		for(int i=0;i<list2length-list1length;i++) {
			headB = headB.next;
		}
		while(headA!= null && headB!=null) {
			if(headA == headB) return headA;
			headA = headA.next;
			headB = headB.next;
		}
	
	return null;
        
    }
	
	public int LLLength(ListNode head) {
		int count = 0;
		while(head!=null) {
			count++;
			head = head.next;
		}
		return count;
	}
	
	public ListNode getIntersection(ListNode headA, ListNode headB) {
		ListNode first = headA;
		ListNode second = headB;
		while(first != second) {
			if(first == null) first = headB;
			else first = first.next;
			if(second == null) second = headA;
			else second = second.next;	
		}
		return first;
	}

}
