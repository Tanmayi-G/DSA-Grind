package SlidingWindow;

public class Max_consecutive_ones {
    public int longestOnes(int[] nums, int k) {
        int zeros=0; int maxLen=0;
        int l=0; int r=0;
        while(r<nums.length){
            if(nums[r]==0) zeros++;
            if(zeros>k){
                if(nums[l]==0) zeros--;
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}
