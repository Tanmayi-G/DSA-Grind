package StacksAndQueues;

import java.util.Stack;

public class Remove_k_digits {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        int n=num.length();

        for(int i=0;i<n;i++){
            char ch=num.charAt(i);
            while(!st.isEmpty() && k>0 && st.peek()>ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }

        //edge case 3: if k remains after the iteration, remove the last digits
        while(!st.isEmpty() && k>0){
            st.pop();
            k--;
        }

        //edge case 1: if k==n return '0'
        if(st.isEmpty()) return "0";


        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        ans.reverse();

        //edge case 2: remove trailing 0s if any
        while(ans.length()>0 && ans.charAt(0)=='0'){
            ans.deleteCharAt(0);
        }
        
        return ans.length()>0 ? ans.toString() : "0";
    }
}
