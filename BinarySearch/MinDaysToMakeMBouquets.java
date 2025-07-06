package BinarySearch;

public class MinDaysToMakeMBouquets {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=findMax(piles);
        while(low<=high){
            int mid=(low+high)/2;
            int hoursReq=calcHoursReq(piles,mid);
            if(hoursReq<=h) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
    public int findMax(int[] arr){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            maxi=Math.max(maxi,arr[i]);
        }
        return maxi;
    }
    public int calcHoursReq(int[] piles,int k){
        int cnt=0;
        for(int i=0;i<piles.length;i++){
            cnt+=Math.ceil((double)piles[i]/(double)k);
        }
        return cnt;
    }
}
