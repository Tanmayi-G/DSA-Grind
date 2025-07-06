package LinkedLists;

public class DeleteAllOccurrencesOfXInLL {
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            next = prev = null;
        }
    }

    static Node deleteAllOccurOfX(Node head, int x) {
        Node temp=head;
        while(temp!=null){
            if(temp.data==x){
                if(temp==head){
                    head=head.next;
                }
                Node prevNode=temp.prev;
                Node nextNode=temp.next;
                if(prevNode!=null) prevNode.next=nextNode;
                if(nextNode!=null) nextNode.prev=prevNode;
                temp=nextNode;
            }else{
                temp=temp.next;
            }
        }
        
        return head;
    }
}
