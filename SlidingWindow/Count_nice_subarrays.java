package SlidingWindow;

public class Count_nice_subarrays {
    public int numberOfSubarrays(int[] nums, int k) {
        return func(nums,k)-func(nums,k-1);
    }
    int func(int[] nums,int k){
        int l=0,r=0,sum=0,cnt=0;
        while(r<nums.length){
            sum+=nums[r]%2;
            while(l<=r && sum>k){
                sum-=nums[l]%2;
                l++;
            }
            cnt+=(r-l+1);
            r++;
        }
        return cnt;
    }
}
