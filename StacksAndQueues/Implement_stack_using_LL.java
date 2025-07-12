package StacksAndQueues;

public class Implement_stack_using_LL {
    class StackNode {
        int data;
        StackNode next;
        StackNode(int a) {
            data = a;
            next = null;
        }
    }

    StackNode top=null;
    int size=0;

    void push(int a) {
        StackNode newNode=new StackNode(a);
        newNode.next=top;
        top=newNode;
        size++;
    }

    int pop() {
        if(size==0) return -1;
        
        StackNode temp=top;
        top=top.next;
        temp.next=null;
        size--;
        return temp.data;
    }

    int peek(){
        if(size==0) return -1;
        return top.data;
    }
}
