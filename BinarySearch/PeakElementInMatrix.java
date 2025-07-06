package BinarySearch;

public class PeakElementInMatrix {
    public int[] findPeakGrid(int[][] mat) {
        int m=mat.length; //rows
        int n=mat[0].length; //cols

        int low=0; int high=n-1;
        while(low<=high){
            int mid=(low+high)/2; //colNo.
            int maxi=findMaxInRow(mat,mid,m); //rowNo.
            int left=mid-1>=0 ? mat[maxi][mid-1] : -1;
            int right=mid+1<n ? mat[maxi][mid+1] : -1;
            if(mat[maxi][mid]>left && mat[maxi][mid]>right){
                return new int[]{maxi,mid};
            }else if(left>mat[maxi][mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    int findMaxInRow(int[][] mat,int col, int m){
        int maxi=0; int maxiInd=-1;
        for(int i=0;i<m;i++){
            if(mat[i][col]>maxi){
                maxi=mat[i][col];
                maxiInd=i;
            }
        }
        return maxiInd;
    }
}
