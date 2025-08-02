package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class Longest_substring_without_repeating_chars {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int n=s.length();
        int l=0; int r=0;
        int maxLen=0;
        while(r<n){
            if(map.containsKey(s.charAt(r))){
                l=Math.max(l,map.get(s.charAt(r))+1);
            }
            map.put(s.charAt(r),r);
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}
