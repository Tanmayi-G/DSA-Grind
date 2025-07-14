package StacksAndQueues;

import java.util.Stack;

public class Largest_rectangle_in_histogram_Optimal {
    public int largestRectangleArea(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int maxArea=0;
        for(int i=0;i<=n;i++){
            while(!st.isEmpty() && (i==n || arr[st.peek()]>=arr[i])){
                int height=arr[st.peek()];
                st.pop();
                int rs=i;
                int ls=st.isEmpty() ? -1 : st.peek();
                maxArea=Math.max(maxArea,(rs-ls-1)*height);
            }
            st.push(i);
        }
        return maxArea;
    }
}
