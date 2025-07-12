package StacksAndQueues;

import java.util.Stack;

public class Infix_to_Prefix {
    static int priority(char ch){
        if(ch=='^') return 3;
        if(ch=='*' || ch=='/') return 2;
        if(ch=='+' || ch=='-') return 1;
        return -1;
    }

    static StringBuilder reverseAndInvertParentheses(String s) {
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == '(') reversed.append(')');
            else if (ch == ')') reversed.append('(');
            else reversed.append(ch);
        }
        return reversed;
    }

    public String infixToPrefix(String str) {
        StringBuilder ans=new StringBuilder();
        Stack<Character> st=new Stack<>();

        StringBuilder s=reverseAndInvertParentheses(str);

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
                if(s.charAt(i)=='^'){
                    while(!st.isEmpty() && priority(st.peek())>=priority(s.charAt(i)))
                        ans.append(st.pop());
                }else{
                    while(!st.isEmpty() && priority(st.peek())>priority(s.charAt(i)))
                        ans.append(st.pop());
                }
                st.push(s.charAt(i));
            }
        }
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        ans=ans.reverse();
        return ans.toString();
    }
}
