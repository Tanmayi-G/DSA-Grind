package StacksAndQueues;

public class Implement_queue_using_LL {
    class QueueNode{
	    int data;
	    QueueNode next;
	    QueueNode(int a){
	        data = a;
	        next = null;
	    }
    }

    QueueNode front, rear;
    int size=0;
    
	void push(int a)
	{
        QueueNode newNode=new QueueNode(a);
        if(front==null){
            front=newNode;
            rear=newNode;
        }else{
            rear.next=newNode;
            rear=rear.next;
        }
        size++;
	}
	
	int pop()
	{
        if(front==null) return -1;
        
        QueueNode temp=front;
        front=front.next;
        temp.next=null;
        size--;
        return temp.data;
	}

    int peek(){
        if(front==null) return 0;
        return front.data;
    }
}
