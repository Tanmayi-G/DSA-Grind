package StacksAndQueues;

import java.util.Stack;

public class Maximal_rectangle {
    public int maximalRectangle(char[][] matrix) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0) return 0;
        
        int maxRect=0;
        int n=matrix.length; //rows
        int m=matrix[0].length; //cols

        int[][] prefixSum=new int[n][m];

        for(int j=0;j<m;j++){ //for each column
            int sum=0;
            for(int i=0;i<n;i++){ //for each element in each column
                int ele=matrix[i][j]-'0';
                sum+=ele;
                if(ele==0){
                    sum=0;
                    prefixSum[i][j]=0;
                }else{
                    prefixSum[i][j]=sum;
                }
            }
        }

        for(int[] row:prefixSum){
            maxRect=Math.max(maxRect,largestRectangleArea(row));
        }

        return maxRect;
    }
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
