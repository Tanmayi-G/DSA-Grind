package LinkedLists;

public class ReverseNodesInKGroup {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prev=null;
        ListNode next=null;
        while(temp!=null){
            ListNode kNode=findKNode(temp,k);
            if(kNode==null){
                if(prev!=null) prev.next=temp;
                break;
            }
            next=kNode.next;
            kNode.next=null;

            reverse(temp);
            if(temp==head) head=kNode;
            else prev.next=kNode;
             
            prev=temp;
            temp=next;
        }
        return head;
    }
    
    ListNode findKNode(ListNode temp,int k){
        k--;
        while(temp!=null && k!=0){
            k--;
            temp=temp.next;
        }
        return temp;
    }

    ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}
