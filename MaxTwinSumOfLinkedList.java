public class MaxTwinSumOfLinkedList {
    //In a linked list of size n, where n is even, the ith node (0-indexed) of the linked list is known as the twin of the (n-1-i)th node, if 0 <= i <= (n / 2) - 1.
    //
    //For example, if n = 4, then node 0 is the twin of node 3, and node 1 is the twin of node 2. These are the only nodes with twins for n = 4.
    //The twin sum is defined as the sum of a node and its twin.
    //
    //Given the head of a linked list with even length, return the maximum twin sum of the linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public int pairSum(ListNode head) {
        ListNode curr = head, next = null, prev = null, slow = head, fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        int max = 0;
        while(slow!=null){
            max = Math.max(prev.val+slow.val, max);
            slow = slow.next;
            prev = prev.next;
        }
        return max;
    }
}
