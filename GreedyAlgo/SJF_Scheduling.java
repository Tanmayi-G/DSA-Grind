package GreedyAlgo;

import java.util.Arrays;

public class SJF_Scheduling {
    public long solve(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        long t=0; long avgWt=0;
        for(int i=0;i<n;i++){
            avgWt+=t;
            t+=arr[i];
        }
        return (avgWt/n);
    }
}
