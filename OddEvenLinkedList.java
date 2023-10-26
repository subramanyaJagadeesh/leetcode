public class OddEvenLinkedList {
    //Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
    //
    //The first node is considered odd, and the second node is even, and so on.
    //
    //Note that the relative order inside both the even and odd groups should remain as it was in the input.
    //
    //You must solve the problem in O(1) extra space complexity and O(n) time complexity.
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode resultOdd = null;
        ListNode resultEven = null;
        ListNode oddP = null;
        ListNode evenP = null;
        int index = 1;
        while(head!=null){
            if(index%2!=0){
                if(resultOdd == null){
                    resultOdd = new ListNode(head.val, head.next);
                    oddP = resultOdd;
                }else{
                    oddP.next = head;
                    oddP = oddP.next;
                }
            } else {
                if(resultEven == null){
                    resultEven = new ListNode(head.val, head.next);
                    evenP = resultEven;
                }else{
                    evenP.next = head;
                    evenP = evenP.next;
                }
            }
            head = head.next;
            index++;
        }
        evenP.next = null;
        oddP.next = resultEven;
        return resultOdd;
    }
}
