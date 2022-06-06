package com.slash.exercise;

public class Solution {

	public static ListNode reverseList(ListNode head) {
		ListNode newHead = new ListNode();
		ListNode preNode = null;
		ListNode temp = new ListNode();
		while (head != null) {
			// 1. 紀錄下一個節點
			temp = head.next;
			// 2. 將下一個節點指向前一個節點
			head.next = preNode;
			// 3. 將前節點指向目前節點
			preNode = head;
			// 4. 將目前節點往下面移動
			head = temp;
		}
		newHead = preNode;
		return newHead;
	}

	public static void main(String[] args) {
		ListNode ln1 = new ListNode(1);
		ListNode ln2 = new ListNode(2);
		ListNode ln3 = new ListNode(3);
		ListNode ln4 = new ListNode(4);
		ListNode ln5 = new ListNode(5);

		ln1.next = ln2;
		ln2.next = ln3;
		ln3.next = ln4;
		ln4.next = ln5;
		System.out.println(ln1);
		System.out.println(reverseList(ln1));
	}
}
