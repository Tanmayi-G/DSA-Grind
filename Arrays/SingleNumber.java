package Arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public int singleNumber(int[] arr) {
        int n=arr.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1) return entry.getKey();
        }
        return 0;
    }
}
