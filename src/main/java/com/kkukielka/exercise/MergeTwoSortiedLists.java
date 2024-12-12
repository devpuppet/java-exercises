package com.kkukielka.exercise;

import java.util.Stack;

public class MergeTwoSortiedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        Stack<Integer> stack = new Stack<>();

        while(list1 != null || list2 != null) {

            int val;
            Integer val1 = list1 == null ? null : list1.val;
            Integer val2 = list2 == null ? null : list2.val;

            if (val1 == null) {
                val = val2;
                list2 = list2.next;
            } else if (val2 == null) {
                val = val1;
                list1 = list1.next;
            } else if (val1 <= val2) {
                val = val1;
                list1 = list1.next;
            } else {
                val = val2;
                list2 = list2.next;
            }

            stack.push(val);
        }

        return buildListNode(stack);
    }

    private ListNode buildListNode(Stack<Integer> stack) {
        ListNode node = null;
        ListNode next = null;
        while(!stack.isEmpty()) {
            int val = stack.pop();

            node = new ListNode(val, next);
            next = node;
        }

        return node;
    }


    public ListNode buildTestList1() {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(2, node1);
        ListNode node3 = new ListNode(1, node2);
        return node3;
    }

    public ListNode buildTestList2() {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(3, node1);
        ListNode node3 = new ListNode(1, node2);
        return node3;
    }

    public ListNode buildTestList3() {
        ListNode node1 = new ListNode();
        return node1;
    }

    public ListNode buildTestList4() {
        ListNode node1 = new ListNode(1);
        return node1;
    }


    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}



