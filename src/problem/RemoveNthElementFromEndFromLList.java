package problem;

/**
 * Created by DZCVT40 on 22.11.2016.
 */
public class RemoveNthElementFromEndFromLList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n == 0) {
            return head;
        } else if (head.next != null) {
            ListNode current = head;
            while (current != null) {
                ListNode tail = current;
                for (int i = 0; i < n; i++) {
                    tail = tail.next;
                    if (tail == null) {
                        return head.next;
                    }
                }
                if (tail.next == null) {
                    ListNode nextNode = current.next;
                    current.next = nextNode.next;
                    return head;


                }
                current = current.next;
            }
        } else {
            if (n == 1) {
                head = null;
            }
        }

        return head;
    }
}
