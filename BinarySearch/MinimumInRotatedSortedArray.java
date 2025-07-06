package BinarySearch;

public class MinimumInRotatedSortedArray {
    public int findMin(int[] arr) {
        int n=arr.length;
        int ans=Integer.MAX_VALUE;
        int low=0; int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[mid]){  //left half is sorted
                ans=Math.min(ans,arr[low]);
                low=mid+1;
            }else{  //right half is sorted
                ans=Math.min(ans,arr[mid]);
                high=mid-1;
            }
        }
        return ans;
    }
}
