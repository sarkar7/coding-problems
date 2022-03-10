package com.sarkar.algo.linkedlist;

public class MergeTwoSortedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1, null);
		head.next = new ListNode(2, null);
		head.next.next = new ListNode(5, null);

		traverse(head);
		insert(head, 3);
		traverse(head);
		insert(head, 4);
		traverse(head);
		//insert(head, 0);
		//traverse(head);
	}

	private static void insert(ListNode head, int n) {
		while (head != null) {
			if (head.val <= n) {
				if (head.next.val > n) {
					ListNode temp = new ListNode(n, null);
					temp.next = head.next;
					head.next = temp;
					break;
				} else {
					head = head.next;
				}
			} else {
				//ListNode temp = new ListNode(n, null);
				//temp.next = head;
				//head = temp.next;
			}
		}
	}

	private static void traverse(ListNode head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
		System.out.println();
	}

}
