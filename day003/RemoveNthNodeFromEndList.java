package day003;

/**
 * 19. Remove Nth Node From End of List
 *
 * @author created by sunjy on 10/31/24
 */
public class RemoveNthNodeFromEndList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode slow = dummy;
        ListNode fast = dummy;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
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
