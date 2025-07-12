package StacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;

public class Implement_stack_using_2_queues {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public Implement_stack_using_2_queues() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();

    }
    
    public void push(int x) {
        q2.add(x);
        while(!q1.isEmpty()) q2.add(q1.poll());
        while(!q2.isEmpty()) q1.add(q2.poll());
    }
    
    public int pop() {
        return q1.poll();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}
