public class DeleteMiddleNodeOfLinkedList {
    //You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.
    //
    //The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using 0-based indexing, where ⌊x⌋ denotes the largest integer less than or equal to x.
    //
    //For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively.
     public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            head = null;
            return head;
        }
        if(head.next.next == null){
            head.next = null;
            return head;
        }
        ListNode slowPointer = new ListNode(head.val, head.next);
        ListNode fastPointer = new ListNode(head.val, head.next);
        while(fastPointer!=null && fastPointer.next!=null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        if(slowPointer.next!=null){
            slowPointer.val = slowPointer.next.val;
            slowPointer.next = slowPointer.next.next;
        } else {
            slowPointer = null;
        }
        return head;
    }
}
