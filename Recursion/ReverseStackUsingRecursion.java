package Recursion;

import java.util.Stack;

public class ReverseStackUsingRecursion {
    static void reverse(Stack<Integer> st) {
        if(st.isEmpty() || st.size()==1) return;
        
        int top=st.pop();
        reverse(st);
        insertAtBottom(top,st);
    }
    static void insertAtBottom(int ele, Stack<Integer> st){
        if(st.isEmpty()){ 
            st.push(ele);
            return;
        }
        
        int top=st.pop();
        insertAtBottom(ele,st);
        st.push(top);
    }
}
