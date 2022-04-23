package com.sarkar.algo.linkedlist;

public class ReverseLinkedList {

	public static Node reverse(Node head) {
		Node current = head; // current node that we will be processing
	    Node previous = null; // previous node that we have processed
	    Node next = null; // will be used to temporarily store the next node

	    while (current != null) {
	      next = current.next; // temporarily store the next node
	      current.next = previous; // reverse the current node
	      previous = current; // before we move to the next node, point previous to the current node
	      current = next; // move on the next node
	    }
	    // after the loop current will be pointing to 'null' and 'previous' will be the new head
	    return previous;
	}

	public static void main(String[] args) {
		Node head = new Node(2);
		head.next = new Node(4);
		head.next.next = new Node(6);
		head.next.next.next = new Node(8);
		head.next.next.next.next = new Node(10);

		Node result = ReverseLinkedList.reverse(head);
		System.out.print("Nodes of the reversed LinkedList are: ");
		while (result != null) {
			System.out.print(result.value + " ");
			result = result.next;
		}
	}

}

class Node {
	int value = 0;
	Node next;

	Node(int value) {
		this.value = value;
	}
}
