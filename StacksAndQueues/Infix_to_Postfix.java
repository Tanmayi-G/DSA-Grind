package StacksAndQueues;

import java.util.Stack;

public class Infix_to_Postfix {
    static int priority(char ch){
        if(ch=='^') return 3;
        if(ch=='*' || ch=='/') return 2;
        if(ch=='+' || ch=='-') return 1;
        return -1;
    }
    public static String infixToPostfix(String s) {
        StringBuilder ans=new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                ans.append(s.charAt(i));
            } 
            else if(s.charAt(i)=='(') st.push(s.charAt(i));
            else if(s.charAt(i)==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    ans.append(st.pop());
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() && priority(st.peek())>=priority(s.charAt(i))){
                    ans.append(st.pop());
                }
                st.push(s.charAt(i));
            }
        }
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.toString();
    }
}
