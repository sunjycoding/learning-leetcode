package day003;

/**
 * 24. Swap Nodes in Pairs
 *
 * @author created by sunjy on 10/31/24
 */
public class SwapNodesPairs {

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        while (prev.next != null && prev.next.next != null) {
            ListNode first = prev.next;
            ListNode second = prev.next.next;
            first.next = second.next;
            second.next = first;
            prev.next = second;
            prev = first;
        }
        return dummy.next;
    }

    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            SwapNodesPairs.ListNode current = this;
            while (current != null) {
                stringBuilder.append(current.val).append("->");
                current = current.next;
            }
            stringBuilder.append("null");
            return stringBuilder.toString();
        }
    }

}
