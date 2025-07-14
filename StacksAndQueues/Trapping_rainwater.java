package StacksAndQueues;

public class Trapping_rainwater {
    public int trap(int[] arr) {
        int l=0; int r=arr.length-1;
        int lmax=0; int rmax=0;
        int trappedWater=0;
        while(l<r){
            if(arr[l]<=arr[r]){
                if(lmax>arr[l]){
                    trappedWater+=(lmax-arr[l]);
                }else{
                    lmax=arr[l];
                }
                l++;
            }else{
                if(rmax>arr[r]){
                    trappedWater+=(rmax-arr[r]);
                }else{
                    rmax=arr[r];
                }
                r--;
            }
        }
        return trappedWater;
    }
}
