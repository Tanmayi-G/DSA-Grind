package Arrays;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] arr) {
        int len=0;
        int maxLen=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                len++;
                maxLen=Math.max(maxLen,len);
            }else{
                len=0;
            }
        }
        return maxLen;
    }
}
