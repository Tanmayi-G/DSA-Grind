package StacksAndQueues;

import java.util.Stack;

public class Implement_queue_using_input_output_stacks {
    Stack<Integer> input;
    Stack<Integer> output;

    public Implement_queue_using_input_output_stacks() {
        input=new Stack<>();
        output=new Stack<>();
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        if(!output.isEmpty()){
            return output.pop();
        }else{
            while(!input.isEmpty()){
                output.push(input.pop());
            }
            return output.pop();
        }
    }
    
    public int peek() {
        if(!output.isEmpty()){
            return output.peek();
        }else{
            while(!input.isEmpty()){
                output.push(input.pop());
            }
            return output.peek();
        }
    }
    
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }
}
