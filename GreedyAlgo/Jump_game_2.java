package GreedyAlgo;

public class Jump_game_2 {
    public int jump(int[] nums) {
        return f(nums,0,0);
    }
    int f(int[] nums, int ind, int jumps){
        int mini=Integer.MAX_VALUE;
        if(ind>=nums.length-1) return jumps;
        for(int i=1;i<=nums[ind];i++){
            mini=Math.min(mini,f(nums,ind+i,jumps+1));
        }
        return mini;
    }
}
