package StacksAndQueues;

import java.util.Stack;

public class Sum_of_subarray_minimums {
    public int sumSubarrayMins(int[] arr) {
        int mod=(int)1e9+7;
        int sum=0;
        int[] nse=findNSE(arr);
        int[] psee=findPSEE(arr);
        for(int i=0;i<arr.length;i++){
            int left=i-psee[i];
            int right=nse[i]-i;
            long noOfSubarrays=left*right*1L;
            int contribution=(int)((noOfSubarrays*arr[i])%mod);
            sum=(sum+contribution)%mod;
        }
        return sum;
    }
    int[] findNSE(int[] arr){
        int[] nse=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]) st.pop();
            nse[i]=st.isEmpty() ? arr.length : st.peek();
            st.push(i);
        }
        return nse;
    }
    int[] findPSEE(int[] arr){
        int[] psee=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]) st.pop();
            psee[i]=st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return psee;
    }
}
