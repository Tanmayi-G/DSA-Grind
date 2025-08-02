package GreedyAlgo;

import java.util.Arrays;

public class N_meetings_in_a_room {
    class Data{
        int start,end;
        Data(int start,int end){
            this.start=start;
            this.end=end;
        }
    }
    public int maxMeetings(int start[], int end[]) {
        int n=start.length;
        Data[] arr=new Data[n];
        for(int i=0;i<n;i++){
            arr[i]=new Data(start[i],end[i]);
        }
        Arrays.sort(arr,(a,b)->a.end-b.end);
        
        int cnt=0; int freeTime=-1;
        for(int i=0;i<n;i++){
            if(arr[i].start>freeTime){
                cnt++;
                freeTime=arr[i].end;
            }
        }
        return cnt;
    }
}
