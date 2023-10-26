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
        //check whether the list nodes are non-null
        while(Objects.nonNull(list1) && Objects.nonNull(list2)){
            ListNode newNode = new ListNode();
            //list 1 val is less so should be placed first
            if(list1.val <= list2.val){
                newNode.val = list1.val;
                list1 = list1.next;
            }
            //list 2 val is less so should be placed first
            else {
                newNode.val = list2.val;
                list2 = list2.next;
            }
            //if first node being placed in head
            if(head.next == null && tail.next == null){
                head.next = newNode;
                tail = newNode;
            }
            //if list already has nodes
            else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        //Add remaining list1 values
        if(Objects.nonNull(list1))
            if(Objects.isNull(head.next))
                head = list1;
            else
                tail.next = list1;

        if(Objects.nonNull(list2))
            if(Objects.isNull(head.next))
                head = list2;
            else
                tail.next = list2;
        if(head.val == -101)
            head = head.next;
        return head;
    }
}
