package org.goutham.solutions;

//Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    
    public static void main(String args[]) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2, l1);
		ListNode l3 = new ListNode(2, l2);
		ListNode l4 = new ListNode(1, l3);
		isPalindrome(l4);
	}
    
    public static boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast !=null && fast.next !=null){ //locate the second half of the ListNode
            fast=fast.next.next;
            slow=slow.next;
        }
        fast=head; // return to the head
        slow=reverse(slow); //reverse the second half to compare
        
        while(slow != null){
            if(slow.val != fast.val){
                return false;
            }
            slow=slow.next;
            fast=fast.next;
        }
        return true;
        
    }
    private static  ListNode reverse (ListNode head){ // reverse the LinkedList like Leetcode #206
        ListNode prev=null;
        while(head != null){
            ListNode next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
}
