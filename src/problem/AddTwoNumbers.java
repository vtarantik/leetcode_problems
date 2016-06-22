package problem;

/**
 *
 * Created by vtarantik on 22.6.2016.
 * https://leetcode.com/problems/add-two-numbers/
 */
public class AddTwoNumbers {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node1 = l1;
        ListNode node2 = l2;
        ListNode toReturn = null;
        ListNode currentNode = toReturn;
        int transfer = 0;
        while (node1 != null || node2 != null) {
            int result = 0;
            if (node1 != null) {
                result += node1.val;
                node1 = node1.next;
            }
            if (node2 != null) {
                result += node2.val;
                node2 = node2.next;
            }

            if (toReturn == null) {
                toReturn = new ListNode((result % 10));
                currentNode = toReturn;

            } else {
                result += transfer;
                currentNode.next = new ListNode((result % 10));
                currentNode = currentNode.next;

            }
            transfer = result / 10;

        }
        if (transfer != 0) {
            currentNode.next = new ListNode(transfer);
        }

        return toReturn;
    }
}
