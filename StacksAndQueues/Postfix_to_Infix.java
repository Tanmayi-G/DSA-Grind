package StacksAndQueues;

import java.util.Stack;

public class Postfix_to_Infix {
    static String postToInfix(String s) {
        Stack<String> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                st.push(String.valueOf(s.charAt(i)));
            }else{
                String t1=st.pop();
                String t2=st.pop();
                String newExp='('+t2+s.charAt(i)+t1+')';
                st.push(newExp);
            }
        }
        return st.peek();
    }
}
