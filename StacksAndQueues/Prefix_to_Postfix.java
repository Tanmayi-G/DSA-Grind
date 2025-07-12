package StacksAndQueues;

import java.util.Stack;

public class Prefix_to_Postfix {
    static String preToPost(String s) {
        Stack<String> st=new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            if(Character.isLetterOrDigit(s.charAt(i))){
                st.push(String.valueOf(s.charAt(i)));
            }else{
                String t1=st.pop();
                String t2=st.pop();
                String newExp=t1+t2+s.charAt(i);
                st.push(newExp);
            }
        }
        return st.peek();
    }
}
