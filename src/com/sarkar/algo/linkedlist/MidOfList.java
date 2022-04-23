package com.sarkar.algo.linkedlist;

public class MidOfList {

	public static ListNode middleNode1(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while (head != null) {
            count++;
            head = head.next;
        }
        
        if (count == 1) return temp;
        int mid = count / 2;
        //System.out.println("Count - " + count +" | Mid - " + mid);
        while (temp != null && mid > 0) {
        	//System.out.println(temp.val);
            temp = temp.next;
            mid--;
        }
        return temp;
    }
	
	public static ListNode middleNode2(ListNode head) {
		 ListNode fastPointer = head;
	        ListNode slowPointer = head;
	        //We will move fastPointer twice and slowPointer once at a time
	        while (fastPointer != null && fastPointer.next != null) {
	            slowPointer = slowPointer.next;
	            fastPointer = fastPointer.next.next;
	        }
	        return slowPointer;
	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		head.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		ListNode temp = middleNode2(head);
		
		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}

}
