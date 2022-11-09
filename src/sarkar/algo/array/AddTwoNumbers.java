package sarkar.algo.array;

import java.math.BigInteger;

import sarkar.algo.linkedlist.ListNode;

public class AddTwoNumbers {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		BigInteger r = getSum(l1).add(getSum(l2));
		if (r.equals(new BigInteger("0"))) {
			return new ListNode(0);
		}
		ListNode head = null;
		while (!r.equals(new BigInteger("0"))) {
			int val = r.mod(new BigInteger("10")).intValue();
			ListNode node = new ListNode(val, null);
			if (head == null) {
				head = node;
			} else {
				ListNode last = head;
				while (last.next != null) {
					last = last.next;
				}
				last.next = node;
			}
			r = r.divide(new BigInteger("10"));
		}
		return head;
	}

	public static int getSize(ListNode node) {
		int counter = 0;
		while (node != null) {
			counter++;
			node = node.next;
		}
		return counter;
	}

	public static BigInteger getSum(ListNode node) {
		BigInteger sum = new BigInteger("0");
		int l = getSize(node);
		ListNode tempnode = node;
		for (int i = 0; i < l; i++) {
			sum = sum.add(
					new BigInteger("10")
					.pow(i)
					.multiply(BigInteger.valueOf(tempnode.val)));
			tempnode = tempnode.next;
		}
		return sum;
	}

	public static void main(String[] args) {

	}

}
