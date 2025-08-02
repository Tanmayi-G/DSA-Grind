package GreedyAlgo;

import java.util.Arrays;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

public class Job_sequencing_problem {
    int[] JobScheduling(Job arr[], int n)
    {
        int maxDeadline=-1;
        for(int i=0;i<n;i++)
            maxDeadline=Math.max(maxDeadline,arr[i].deadline);
        
        int[] performJob=new int[maxDeadline+1];
        for(int i=1;i<=maxDeadline;i++)
            performJob[i]=-1;
        
        Arrays.sort(arr,(a,b)->(b.profit-a.profit));
        int cnt=0;
        int profit=0;
        for(int i=0;i<n;i++){
            for(int j=arr[i].deadline;j>=1;j--){
                if(performJob[j]==-1){
                    performJob[j]=i;
                    cnt++;
                    profit+=arr[i].profit;
                    break;
                }
            }
        }
        
        int[] res=new int[2];
        res[0]=cnt;
        res[1]=profit;
        return res;
    }
}
