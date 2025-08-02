package SlidingWindow;

public class Pattern_1 {
    public int maxSumWithKElements(int[] arr, int k) {
        int l=0; int r=k-1;
        int maxSum=0;

        int sum=0;
        for(int i=l;i<=r;i++) sum+=arr[i];

        maxSum=sum;
        while(r<arr.length){
            sum-=arr[l];
            l++; r++;
            sum+=arr[r];
            maxSum=Math.max(maxSum,sum);
        }

        return maxSum;
    }
}
