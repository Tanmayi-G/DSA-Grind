package SlidingWindow;

public class Pattern_2 {
    public int longestSubarrayWithSumLoeK(int[] arr, int k) {
        int l=0; int r=0;
        int maxLen=0;
        int sum=0;
        while(r<arr.length){
            sum+=arr[r];
            if(sum>k){
                sum-=arr[l];
                l++;
            }
            if(sum<=k){
                maxLen=Math.max(maxLen,r-l+1);
            }
            r++;
        }
        return maxLen;
    }
}
