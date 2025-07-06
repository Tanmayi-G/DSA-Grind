package BinarySearch;

public class SplitArrayLargestSum {
    public int splitArray(int[] arr, int k) {
        //perform bs on largest sum of subarray
        //low=max(arr), high=sum(arr)
        int low=0; int high=0;
        for(int i=0;i<arr.length;i++){
            low=Math.max(low,arr[i]);
            high+=arr[i];
        }

        while(low<=high){
            int mid=(low+high)/2;
            if(cntSubarrays(arr,mid)<=k){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    int cntSubarrays(int[] arr,int maxSum){
        int sum=0; int noOfSubarrays=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]+sum<=maxSum){
                sum+=arr[i];
            }else{
                noOfSubarrays++;
                sum=arr[i];
            }
        }
        return noOfSubarrays;
    }
}
