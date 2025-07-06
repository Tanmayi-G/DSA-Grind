package Arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int longest=0;

        for(int i=0;i<nums.length;i++) set.add(nums[i]);

        for(int it:set){
            if(!set.contains(it-1)){
                int x=it; //x is the starting point of the sequence 
                int cnt=1;
                while(set.contains(x+1)){
                    cnt++;
                    x++;
                }
                longest=Math.max(longest,cnt);
            }
        }
        return longest;
    }
}
