package LinkedList;

import utils.ListNode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int exSum = 0;
        ListNode result = new ListNode();
        ListNode exResult = result;
        while (l1 != null || l2 != null) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += exSum;
            exResult.val = sum % 10;
            exSum = sum / 10;
            ListNode temp = new ListNode();
            if (l1 == null && l2 == null) {
                if(exSum > 0)
                    temp = new ListNode(exSum);
                else
                    temp = null;
            }
            exResult.next = temp;
            exResult = temp;
        }
        return result;
    }
}
