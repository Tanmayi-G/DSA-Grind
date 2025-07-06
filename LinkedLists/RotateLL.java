package LinkedLists;

public class RotateLL {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;

        ListNode tail=head;
        int len=1;
        while(tail.next!=null){
            tail=tail.next;
            len++;
        }

        if(k%len==0) return head;
        k=k%len;

        tail.next=head;

        int cnt=1;
        ListNode temp=head;
        while(temp!=null){
            if(cnt==len-k) break;
            temp=temp.next;
            cnt++;
        }
        head=temp.next;
        temp.next=null;

        return head;
    }
}
