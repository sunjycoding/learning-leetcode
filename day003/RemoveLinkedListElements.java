package day003;

/**
 * 203. Remove Linked List Elements
 *
 * @author created by sunjy on 10/31/24
 */
public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0, head);
        ListNode current = dummy;

        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
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
            ListNode current = this;
            while (current != null) {
                stringBuilder.append(current.val).append("->");
                current = current.next;
            }
            stringBuilder.append("null");
            return stringBuilder.toString();
        }
    }

}
