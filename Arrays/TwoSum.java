package Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] arr, int target) {
        int n=arr.length;
        Map<Integer,Integer> map=new HashMap<>(); //element,index
        for(int i=0;i<n;i++){
            int diff=target-arr[i];
            if(map.containsKey(diff)){
                return new int[]{i,map.get(diff)};
            }
            map.put(arr[i],i);
        }
        return new int[]{0,0};
    }
}
