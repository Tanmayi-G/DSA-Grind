package Arrays;

public class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left=m-1;
        int right=n-1;
        int temp=n+m-1;
        while(right>=0){
            if(left>=0 && nums1[left]>=nums2[right]){
                nums1[temp]=nums1[left];
                temp--;
                left--;
            }else{
                nums1[temp]=nums2[right];
                temp--;
                right--;
            }
        }
    }
}
