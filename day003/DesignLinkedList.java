package day003;

/**
 * 707. Design Linked List
 *
 * @author created by sunjy on 10/31/24
 */
public class DesignLinkedList {

    public static class MyLinkedList {

        ListNode dummyHead;
        int size;

        public MyLinkedList() {
            dummyHead = new ListNode(null, null);
        }

        public int get(int index) {
            if (index < 0 || index >= size) {
                return -1;
            }
            ListNode current = dummyHead.next;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.val;
        }

        public void addAtHead(int val) {
            addAtIndex(0, val);
        }

        public void addAtTail(int val) {
            addAtIndex(size, val);
        }

        public void addAtIndex(int index, int val) {
            if (index < 0 || index > size) {
                return;
            }
            ListNode prev = dummyHead;
            for (int i = 0; i < index; i++) {
                prev = prev.next;
            }
            prev.next = new ListNode(val, prev.next);
            size++;
        }

        public void deleteAtIndex(int index) {
            if (index < 0 || index >= size) {
                return;
            }
            ListNode prev = dummyHead;
            for (int i = 0; i < index; i++) {
                prev = prev.next;
            }
            ListNode node = prev.next;
            prev.next = node.next;
            node.next = null;
            size--;
        }

        public static class ListNode {
            Integer val;
            ListNode next;

            public ListNode(Integer val, ListNode next) {
                this.val = val;
                this.next = next;
            }

            public ListNode(Integer val) {
                this(val, null);
            }

            public ListNode() {
                this(null, null);
            }

        }
    }

}
