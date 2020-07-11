package org.goutham.solutions;

public class MiddleLinkedList {
	
	/**
	 * Given a non-empty, singly linked list with head node head, return a middle node of linked list.
	 * 
	 * If there are two middle nodes, return the second middle node.
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);

	}
	
	public static ListNode middleNode(ListNode head) {
		ListNode middleListNode = head;
		ListNode endListNode = head;
		if(head == null) {
			return null;
		}
		while(endListNode != null && endListNode.next != null) {
			middleListNode = middleListNode.next;
			endListNode = endListNode.next.next;
		}
        return middleListNode;
    }

}


  
 
