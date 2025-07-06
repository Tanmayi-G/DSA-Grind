package BinarySearch;

public class MinimizeMaxDistToGasStations {
    public static double findSmallestMaxDist(int arr[], int k) {
        //Optimal sol: Modified binary search
        //perform bs on max dist. between gas stations
        //low=0, high=max section length
        int n=arr.length;
        
        double low=0; double high=0;
        for(int i=0;i<n-1;i++){
            high=Math.max(high,(double)(arr[i+1]-arr[i]));
        }
        
        double diff=1e-6;
        while(high-low>diff){
            double mid=(low+high)/2.0;
            if(noOfStations(arr,mid)<=k){
                high=mid;
            }else{
                low=mid;
            }
        }
        return high;
    }
    static int noOfStations(int[] arr,double maxDist){
        int cnt=0;
        for(int i=0;i<arr.length-1;i++){
            int numOfStationsInBetween=(int)((arr[i+1]-arr[i])/maxDist);
            if(arr[i+1]-arr[i]==(numOfStationsInBetween*maxDist)){
                numOfStationsInBetween--;
            }
            cnt+=numOfStationsInBetween;
        }
        return cnt;
    }
}
