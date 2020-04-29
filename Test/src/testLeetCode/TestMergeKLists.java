package testLeetCode;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestMergeKLists {

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			this.val = x;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode[] lists = new ListNode[3];
		ListNode node1 = new ListNode(1);
		node1.next = new ListNode(4);
		node1.next = new ListNode(5);
		lists[0] = node1;
		ListNode node2 = new ListNode(1);
		node2.next = new ListNode(3);
		node2.next = new ListNode(4);
		lists[1] = node2;
		ListNode node3 = new ListNode(2);
		node3.next = new ListNode(6);
		lists[2] = node3;
		ListNode res = mergeKLists(lists);
		System.out.println(res.toString());
	}

	/**
	 * ∂—≈≈–Ú
	 */
	public static ListNode mergeKLists(ListNode[] lists) {
		if (lists == null || lists.length == 0)
			return null;
		Queue<ListNode> queue = new PriorityQueue<>((v1, v2) -> v1.val - v2.val);
		for (ListNode list : lists) {
			if (list != null) {
				queue.offer(list);
			}
		}
		ListNode dummyList = new ListNode(0);
		ListNode tail = dummyList;
		while (!queue.isEmpty()) {
			ListNode minNode = queue.poll();
			tail.next = minNode;
			tail = minNode;
			if (minNode.next != null) {
				queue.offer(minNode.next);
			}
		}
		return dummyList.next;
	}
	/**
	 *  ±º‰∏¥‘”∂»O(NK)
	 */
//	public static ListNode mergeKLists(ListNode[] lists) {
//		int len = lists.length;
//		if (lists == null || len == 0)
//			return null;
//		ListNode dummyList = new ListNode(0);
//		ListNode tail = dummyList;
//		while (true) {
//			ListNode minNode = null;
//			int minPointer = -1;
//			for (int i = 0; i < len; i++) {
//				if (lists[i] == null) {
//					continue;
//				}
//				if (minNode == null || lists[i].val < minNode.val) {
//					minNode = lists[i];
//					minPointer = i;
//				}
//			}
//			if (minPointer == -1) {
//				break;
//			}
//			tail.next = minNode;
//			tail = tail.next;
//			lists[minPointer] = lists[minPointer].next;
//		}
//		return dummyList.next;
//	}
	/*
	 * public static ListNode mergeKLists(ListNode[] lists) { int k = lists.length;
	 * ListNode dummyHead = new ListNode(0); ListNode tail = dummyHead; while (true)
	 * { ListNode minNode = null; int minPointer = -1; for (int i = 0; i < k; i++) {
	 * if (lists[i] == null) { continue; } if (minNode == null || lists[i].val <
	 * minNode.val) { minNode = lists[i]; minPointer = i; } } if (minPointer == -1)
	 * { break; } tail.next = minNode; tail = tail.next; lists[minPointer] =
	 * lists[minPointer].next; } return dummyHead.next; }
	 */
}
