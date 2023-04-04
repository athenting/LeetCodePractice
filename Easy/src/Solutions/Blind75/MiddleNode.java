package Solutions.Blind75;

import java.util.HashMap;

public class MiddleNode {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode middleNode(ListNode head) {
            ListNode node = null;

            if (head == null) {
                return node;
            }

            HashMap<Integer, ListNode> nodeMap = new HashMap<>();
            nodeMap.put(1, head);

            int count = 0;

            while (head != null) {
                count++;
                nodeMap.put(count++, head);
                head = head.next;
            }

                return nodeMap.get(count / 2 + 1);


        }
    }

}
