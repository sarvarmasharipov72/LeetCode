package DailyLeetCodingChallenge;

import utils.ListNode;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode removeItem = null;
    int i = 1;
        ListNode current = head;
        while (current != null) {
            if (i == n) {
                removeItem = current;
            } else if (i > n) {
                removeItem = removeItem.next;
            }
            i++;
            current = current.next;
        }
        removeItem.next = removeItem.next.next;
        return head;
    }
}
