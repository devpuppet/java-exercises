package com.kkukielka.exercise;

public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode uniqueNode = head;
        ListNode next = uniqueNode.next;

        while (next != null) {
            uniqueNode.next = null;

            int currentVal = uniqueNode.val;
            int nextVal = next.val;

            if (currentVal != nextVal) {
                uniqueNode.next = next;
                uniqueNode = next;
                next = uniqueNode.next;
            } else {
                next = next.next;
            }
        }

        return head;
    }

    public ListNode buildTestList1() {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(3, node1);
        ListNode node3 = new ListNode(2, node2);
        ListNode node4 = new ListNode(1, node3);
        return node4;
    }

    public ListNode buildTestList2() {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(1, node1);
        ListNode node3 = new ListNode(1, node2);
        return node3;
    }

     public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
}
