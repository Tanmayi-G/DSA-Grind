package StacksAndQueues;

import java.util.Stack;

public class Min_Stack {
    Stack<Long> st;
    Long mini=Long.MAX_VALUE;

    public Min_Stack() {
        st=new Stack<>();
    }
    
    public void push(int value) {
        Long val=Long.valueOf(value);
        if(st.isEmpty()){
            st.push(val);
            mini=val;
        }else{
            if(val>=mini){
                st.push(val);
            }else{
                st.push(2*val-mini);
                mini=val;
            }
        }
    }
    
    public void pop() {
        if(st.isEmpty()) return;
        Long val=st.pop();
        if(val<mini){
            mini=2*mini-val;
        }
    }
    
    public int top() {
        if(st.isEmpty()) return -1;

        if(st.peek()>=mini) return st.peek().intValue();
        else return mini.intValue();
    }
    
    public int getMin() {
        return mini.intValue();
    }
}
