import java.util.Stack;

public class ReverseLinkedList {
    //Given the head of a singly linked list, reverse the list, and return the reversed list.
     public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        Stack<ListNode> st = new Stack<>();
        ListNode result = null, rHead = null;
        while(head!=null){
            st.push(head);
            head = head.next;
        }
        result = st.pop();
        rHead = result;
        while(!st.isEmpty()){
            rHead.next = st.pop();
            rHead = rHead.next;
        }
        rHead.next = null;
        return result;
    }
}
