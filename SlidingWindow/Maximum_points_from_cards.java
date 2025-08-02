package SlidingWindow;

public class Maximum_points_from_cards {
    public int maxScore(int[] arr, int k) {
        int n=arr.length;
        int[] sum=new int[n];
        int currSum=0;
        for(int i=0;i<n;i++){
            currSum+=arr[i];
            sum[i]=currSum;
        }

        int totalSum=sum[n-1];
        if(k==n) return totalSum;

        int ans=0; int leftOutSum=0;
        for(int i=0;i<=k;i++){
            int j=i+(n-k-1);

            if(i==0) leftOutSum=sum[j];
            else leftOutSum=sum[j]-sum[i-1];

            ans=Math.max(ans,totalSum-leftOutSum);
        }

        return ans;
    }
}
