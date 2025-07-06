package LinkedLists;

public class LengthOfLoop {
    class Node{
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

    public int countNodesinLoop(Node head) {
        if(head==null || head.next==null) return 0;
        Node slow=head; Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                int cnt=1;
                slow=slow.next;
                while(slow!=fast){
                    slow=slow.next;
                    cnt++;
                }
                return cnt;
            }
        }
        return 0;
    }
}
