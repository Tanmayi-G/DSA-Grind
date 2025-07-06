package BinarySearch;

public class BookAllocation {
    public static int findPages(int[] arr, int k) {
        //perform bs on max. pages that can be assigned to a student
        //low=max in the array, high=sum of arr
        if(arr.length<k) return -1;
        
        int low=0; int high=0;
        for(int i=0;i<arr.length;i++){
            low=Math.max(low,arr[i]);
            high+=arr[i];
        }
        
        while(low<=high){
            int mid=(low+high)/2;
            if(noOfStudents(arr,mid)<=k){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        
        return low;
    }
    static int noOfStudents(int[] arr,int maxPages){
        int students=1; int pages=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]+pages<=maxPages){
                pages+=arr[i];
            }else{
                students++;
                pages=arr[i];
            }
        }
        return students;
    }
}
