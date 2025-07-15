package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;

public class Sliding_window_maximum {
    public int[] maxSlidingWindow(int[] arr, int k) {
        Deque<Integer> dq=new ArrayDeque<>();
        int n=arr.length;
        int[] ans=new int[n-k+1];
        int ansInd=0;

        for(int i=0;i<n;i++){
            //remove out of bound elements
            if(!dq.isEmpty() && dq.peek()<=(i-k)){
                dq.poll(); //pop front
            }

            while(!dq.isEmpty() && arr[dq.peekLast()]<=arr[i]){
                dq.pollLast(); //pop back
            }
            dq.addLast(i); //push back

            if(i>=k-1){
                ans[ansInd]=arr[dq.peek()]; //peek front
                ansInd++;
            }
        }
        return ans;
    }
}
