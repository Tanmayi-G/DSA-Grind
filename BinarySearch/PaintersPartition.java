package BinarySearch;

public class PaintersPartition {
    public int minTime(int[] arr, int k) {
        // code here
        //partition it such that the max time taken by a painter is the minimum possible
        //perform bs on max time taken by a painter
        //low=max(arr), high=sum(arr)
        int low=0; int high=0;
        for(int i=0;i<arr.length;i++){
            low=Math.max(low,arr[i]);
            high+=arr[i];
        }
        
        while(low<=high){
            int mid=(low+high)/2;
            if(cntPainters(arr,mid)<=k){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        
        return low;
    }
    static int cntPainters(int[] arr,int maxTime){
        int time=0; int painters=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]+time<=maxTime){
                time+=arr[i];
            }else{
                painters++;
                time=arr[i];
            }
        }
        return painters;
    }
}
