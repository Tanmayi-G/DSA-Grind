package LinkedLists;

public class ReverseLL {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode newHead=reverseList(head.next);
        ListNode front=head.next;
        head.next=null;
        front.next=head;
        return newHead;
    }
}
