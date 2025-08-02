package SlidingWindow;

public class Minimum_window_substring {
    public String minWindow(String s, String t) {
        int l=0, r=0, cnt=0, sIndex=-1, minlen=Integer.MAX_VALUE;
        int[] map=new int[128];
        for(int i=0;i<t.length();i++) //Pre-insertion
            map[t.charAt(i)]++;

        while(r<s.length()){
            char ch=s.charAt(r);
            if(map[ch]>0) cnt++;
            map[ch]--;
            while(cnt==t.length()){
                //found valid substring
                if(r-l+1<minlen){
                    minlen=r-l+1;
                    sIndex=l;
                }
                map[s.charAt(l)]++;
                if(map[s.charAt(l)]>0) cnt--;
                l++;
            }
            r++;
        }
        return (sIndex==-1)?"":s.substring(sIndex,sIndex+minlen);
    }
}
