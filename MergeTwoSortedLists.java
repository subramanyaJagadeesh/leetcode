import java.util.Objects;

public class MergeTwoSortedLists {
    //You are given the heads of two sorted linked lists list1 and list2.
    //
    //Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
    //
    //Return the head of the merged linked list.

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode tail = new ListNode();

        while(Objects.nonNull(list1) && Objects.nonNull(list2)){
            ListNode newNode = new ListNode();
            if(list1.val <= list2.val){
                newNode.val = list1.val;
                list1 = list1.next;
            } else {
                newNode.val = list2.val;
                list2 = list2.next;
            }
            if(head.next == null && tail.next == null){
                head.next = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        while(Objects.nonNull(list1)){
            ListNode newNode = new ListNode();
            newNode.val = list1.val;
            if(head.next == null && tail.next == null){
                head.next = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            list1 = list1.next;
        }
        while(Objects.nonNull(list2)){
            ListNode newNode = new ListNode();
            newNode.val = list2.val;
            if(head.next == null && tail.next == null){
                head.next = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            list2 = list2.next;
        }
        head = head.next;

        return head;
    }
}
