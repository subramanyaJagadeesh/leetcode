public class AddTwoNumbers {
    //You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
    //You may assume the two numbers do not contain any leading zero, except the number 0 itself.
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, curr = null;
        while (l1 != null && l2 != null) {
            int val = 0;
            if (l1.val <= l2.val) {
                val = l1.val;
                l1 = l1.next;
            } else {
                val = l2.val;
                l2 = l2.next;
            }

            ListNode node = new ListNode(val);
            if (head == null) {
                head = node;
                curr = node;
            } else {
                curr = node;
                curr = curr.next;
            }
        }
        if (l1 != null) {
            curr.next = l1;
            curr = curr.next;
            l1 = l1.next;
        }
        if (l2 != null) {
            curr.next = l2;
            curr = curr.next;
            l2 = l2.next;
        }
        return head;
    }
}
