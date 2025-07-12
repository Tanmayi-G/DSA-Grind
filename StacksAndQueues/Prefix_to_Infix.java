package StacksAndQueues;

import java.util.Stack;

public class Prefix_to_Infix {
    static String preToInfix(String s) {
        Stack<String> st=new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            if(Character.isLetterOrDigit(s.charAt(i))){
                st.push(String.valueOf(s.charAt(i)));
            }else{
                String t1=st.pop();
                String t2=st.pop();
                String newExp='('+t1+s.charAt(i)+t2+')';
                st.push(newExp);
            }
        }
        return st.peek();
    }
}
