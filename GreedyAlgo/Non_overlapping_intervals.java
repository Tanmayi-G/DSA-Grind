package GreedyAlgo;

import java.util.Arrays;

public class Non_overlapping_intervals {
    public int eraseOverlapIntervals(int[][] arr) {
        Arrays.sort(arr,(a,b)->a[1]-b[1]);
        int n=arr.length;
        int cnt=0; int freeTime=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i][0]>=freeTime){
                cnt++;
                freeTime=arr[i][1];
            }
        }
        return n-cnt;
    }
}
