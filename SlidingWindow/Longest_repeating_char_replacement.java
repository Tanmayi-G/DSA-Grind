package SlidingWindow;

public class Longest_repeating_char_replacement {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int[] map=new int[26];
        int l=0,r=0,maxlen=0,maxfreq=0;
        while(r<n){
            map[s.charAt(r)-'A']++;
            maxfreq=Math.max(maxfreq,map[s.charAt(r)-'A']);
            if(r-l+1-maxfreq>k){
                map[s.charAt(l)-'A']--;
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }
}
