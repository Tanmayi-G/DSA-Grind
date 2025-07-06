package BinarySearch;

import java.util.Arrays;

public class AggressiveCows {
    public static int aggressiveCows(int[] stalls, int k) {
        //perform bs on min. dist.
        //low=1 high=max-min
        Arrays.sort(stalls);
        int n=stalls.length;
        int low=1; int high=stalls[n-1]-stalls[0];
        while(low<=high){
            int mid=(low+high)/2;
            if(noOfCowsPlaced(stalls,mid)>=k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return high;
    }
    static int noOfCowsPlaced(int[] stalls,int minDist){
        int cows=1; int lastCowStall=stalls[0];
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-lastCowStall>=minDist){
                cows++;
                lastCowStall=stalls[i];
            }
        }
        return cows;
    }
}
