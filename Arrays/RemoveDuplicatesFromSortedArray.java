package Arrays;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] arr) {
        int i=0;
        int n=arr.length;
        for(int j=1;j<n;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }
}
