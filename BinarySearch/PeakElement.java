package BinarySearch;

public class PeakElement {
    public int findPeakElement(int[] arr) {
        int n=arr.length;
        if(n==1) return 0;
        if(arr[0]>arr[1]) return 0;
        if(arr[n-1]>arr[n-2]) return n-1;

        int low=1; int high=n-2;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
                return mid;
            }else if(arr[mid-1]<arr[mid]){ //mid is in the increasing part
                low=mid+1;
            }else{  //mid is in the decreasing part
                high=mid-1;
            }
        }
        return -1;
    }
}
