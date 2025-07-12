package StacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;

public class Implement_stack_using_1_queue {
    Queue<Integer> q;

    public Implement_stack_using_1_queue() {
        q=new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
        for(int i=1;i<q.size();i++){
            q.add(q.poll());
        }
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}
