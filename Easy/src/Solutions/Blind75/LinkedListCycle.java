package Solutions.Blind75;

import java.util.ArrayList;
import java.util.List;

public class LinkedListCycle {

    //Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }


    public boolean hasCycle(ListNode head) {

        boolean isCyclic = false;
        List<ListNode> list = new ArrayList<>();

        if (head == null || head.next == null) {
            return isCyclic;
        }

        if (head.next == head) {
            isCyclic = true;
            return isCyclic;
        }

        iterate(head, list, isCyclic);

        return isCyclic;
    }

    private boolean iterate(ListNode node, List<ListNode> list, boolean cyclic) {

        while (node.next != null && !list.contains(node)) {
            list.add(node);
            iterate(node.next, list, cyclic);
        }

        if (list.contains(node)) {
            cyclic = true;
        }
        return cyclic;
    }

}
