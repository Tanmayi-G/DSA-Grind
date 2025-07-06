package Recursion;

import java.util.Stack;

public class SortStackUsingRecursion {
    public Stack<Integer> sort(Stack<Integer> st) {
        if(st.isEmpty() || st.size()==1) return st;
        
        int top=st.pop();
        sort(st);
        insert(top,st);
        
        return st;
    }
    void insert(int ele, Stack<Integer> st){
        if(st.isEmpty() || st.peek()<=ele){
            st.push(ele);
            return;
        }
        int top=st.pop();
        insert(ele,st);
        st.push(top);
    }
}
