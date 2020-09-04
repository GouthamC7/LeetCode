package org.goutham.solutions;

public class SwapPairsLL {
	
    public static ListNode swapPairs(ListNode head) {
        ListNode firstListNode = head, secondListNode = firstListNode.next, prevListNode = null;
        while(firstListNode != null && secondListNode != null) {
        	firstListNode.next = secondListNode.next;
        	secondListNode.next = firstListNode;
        	if(prevListNode == null) {
        		prevListNode = firstListNode;
        		head = secondListNode;
        	}
        	else {
        		prevListNode.next = secondListNode;
        		prevListNode = firstListNode;
        	}
        	if(firstListNode.next != null && firstListNode.next.next!=null) {
        		firstListNode = firstListNode.next;
        		secondListNode = firstListNode.next;
        	}
        	else secondListNode = null;
        }
        return head;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = null;
		swapPairs(l1);
	}

}
