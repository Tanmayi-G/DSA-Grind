package BinarySearch;

public class CapacityToShipPackages {
    public int shipWithinDays(int[] weights, int days) {
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i=0;i<weights.length;i++){
            low=Math.max(low,weights[i]);
            high+=weights[i];
        }

        while(low<=high){
            int mid=(low+high)/2;
            if(countDays(weights,mid)<=days) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
    public int countDays(int[] weights,int cap){
        int sum=0;
        int cntDays=1;
        for(int i=0;i<weights.length;i++){
            if(sum+weights[i]>cap){
                sum=weights[i];
                cntDays++;
            }else{
                sum+=weights[i];
            }
        }
        return cntDays;
    }
}
