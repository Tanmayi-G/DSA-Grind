package Arrays;

public class MoveZerosToEnd {
    public void moveZeroes(int[] arr) {
        int i=0;
        int n=arr.length;
        for(int j=0;j<n;j++){
            if(arr[j]!=0){
                arr[i]=arr[j];
                i++;
            }
        }
        while(i<n){ 
            arr[i]=0;
            i++;
        }
    }
}
