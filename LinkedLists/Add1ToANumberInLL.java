package LinkedLists;

public class Add1ToANumberInLL {
    class Node{
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

    public Node addOne(Node head) {
        if (head == null) return new Node(1);
        int carry=helper(head);
        if(carry==1){
            Node newNode=new Node(1);
            newNode.next=head;
            head=newNode;
        }
        return head;
    }

    int helper(Node temp){
        if(temp==null) return 1;
        int carry=helper(temp.next);
        temp.data+=carry;
        if(temp.data<10){
            return 0;
        }
        temp.data=0;
        return 1;
    }
}
