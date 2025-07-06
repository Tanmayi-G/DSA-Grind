package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervals {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        for(int i=0;i<intervals.length;i++){
            //start a new interval
            if(ans.size()==0 || intervals[i][0]>ans.get(ans.size()-1)[1]){
                ans.add(intervals[i]);
            }
            //check if already merged
            else{
                int[] temp=new int[2];
                temp[0]=ans.get(ans.size()-1)[0];
                temp[1]=Math.max(intervals[i][1],ans.get(ans.size()-1)[1]);
                ans.set(ans.size()-1,temp);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
