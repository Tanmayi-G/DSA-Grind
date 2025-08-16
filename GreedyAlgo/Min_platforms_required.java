package GreedyAlgo;

import java.util.Arrays;

public class Min_platforms_required {
    static int findPlatform(int arr[], int dep[]) {
        Arrays.sort(arr); Arrays.sort(dep);
        int i=0; int j=0;
        int cnt=0; int maxi=0;
        while(i<arr.length){
            if(arr[i]<=dep[j]){
                cnt++;
                i++;
            }else{
                cnt--;
                j++;
            }
            maxi=Math.max(maxi,cnt);
        }
        return maxi;
    }
}
