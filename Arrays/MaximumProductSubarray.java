package Arrays;

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int pref=1;
        int suff=1;
        for(int i=0;i<n;i++){
            if(pref==0) pref=1;
            if(suff==0) suff=1;
            pref=pref*nums[i];
            suff=suff*nums[n-1-i];
            max=Math.max(max, Math.max(pref,suff));
        }
        return max;
    }
}
