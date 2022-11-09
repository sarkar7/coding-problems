package sarkar.algo.linkedlist;

public class RemoveNthNodeFromEnd {

	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head, slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        } 
        if (fast == null) return head.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head; 
    }
	
	public static void main(String[] args) {
		

	}

}
