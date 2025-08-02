package GreedyAlgo;

import java.util.Arrays;

public class Assign_cookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); Arrays.sort(s);
        int glen=g.length; int slen=s.length;
        int l=0; int r=0;
        while(l<glen && r<slen){
            if(s[r]>=g[l]){
                r++; l++;
            }else{
                r++;
            }
        }
        return l;
    }
}
