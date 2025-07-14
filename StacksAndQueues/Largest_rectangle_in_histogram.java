package StacksAndQueues;

import java.util.Stack;

public class Largest_rectangle_in_histogram {
    public int largestRectangleArea(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int[] leftSmaller=new int[n];
        int[] rightSmaller=new int[n];

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            leftSmaller[i]=st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        while(!st.isEmpty()) st.pop();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            rightSmaller[i]=st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        int maxArea=0;
        for(int i=0;i<n;i++){
            maxArea=Math.max(maxArea,(rightSmaller[i]-leftSmaller[i]-1)*arr[i]);
        }

        return maxArea;
    }
}
