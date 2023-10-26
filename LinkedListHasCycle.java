public class LinkedListHasCycle {
    //Given head, the head of a linked list, determine if the linked list has a cycle in it.
    //
    //There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
    //
    //Return true if there is a cycle in the linked list. Otherwise, return false.
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode pointer1 = head;
        ListNode pointer2 = head;
        while(pointer1.next!=null || pointer2.next!=null){
            try{
                pointer1 = pointer1.next;
                pointer2 = pointer2.next.next;
                if(pointer2.next == pointer1.next){
                    return true;
                }
            } catch(NullPointerException e){
                return false;
            }
        }
        return false;
    }
}
