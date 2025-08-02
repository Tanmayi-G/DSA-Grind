package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class Fruits_into_baskets {
    public int totalFruit(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();  //(num,freq)
        int l=0; int r=0; int maxLen=0;
        while(r<arr.length){
            map.put(arr[r],map.getOrDefault(arr[r],0)+1);
            if(map.size()>2){
                map.put(arr[l],map.get(arr[l])-1);
                if(map.get(arr[l])==0) map.remove(arr[l]);
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}
