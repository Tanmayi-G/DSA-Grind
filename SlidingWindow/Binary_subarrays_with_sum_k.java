package SlidingWindow;

public class Binary_subarrays_with_sum_k {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return func(nums,goal)-func(nums,goal-1);
    }
    int func(int[] nums,int goal){
        int l=0,r=0,sum=0,cnt=0;
        while(r<nums.length){
            sum+=nums[r];
            while(l<=r && sum>goal){
                sum-=nums[l];
                l++;
            }
            cnt+=(r-l+1);
            r++;
        }
        return cnt;
    }
}
