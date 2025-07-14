package StacksAndQueues;

import java.util.Stack;

public class Balanced_parentheses {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{') st.push(ch);
            else{
                if(st.isEmpty()) return false;
                char popped=st.pop();
                if((popped=='(' && ch==')') ||
                    (popped=='[' && ch==']') ||
                    (popped=='{' && ch=='}'))
                    continue;
                else return false;
            }
        }
        return st.isEmpty();
    }
}
