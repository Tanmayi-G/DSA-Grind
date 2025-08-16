package GreedyAlgo;

import java.util.ArrayList;
import java.util.List;

public class Insert_interval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans=new ArrayList<>();
        int n=intervals.length;
        int i=0;
        while(i<n && intervals[i][1]<newInterval[0]){ //end of interval < start of new interval
            ans.add(intervals[i]);
            i++;
        }

        while(i<n && intervals[i][0]<=newInterval[1]){ //start of interval < end of new interval
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        ans.add(newInterval);

        while(i<n){
            ans.add(intervals[i]);
            i++;
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
