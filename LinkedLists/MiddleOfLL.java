package LinkedLists;

public class MiddleOfLL {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public ListNode middleNode(ListNode head) {
        int len=len(head);
        int mid=len/2+1;
        ListNode temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            if(cnt==mid) return temp;
            temp=temp.next;
        }
        return head;
    }
    public int len(ListNode head){
        int cnt=0;
        ListNode temp=head;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }
}
