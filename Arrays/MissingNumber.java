package Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correctIndex=nums[i];
            if(correctIndex<nums.length-1 && nums[i]!=nums[correctIndex]){
                swap(nums,i,correctIndex);
            }else{
                i++;
            }
        }
        for(int k=0;k<nums.length;k++){
            if(nums[k]!=k) return k;
        }
        return nums.length;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
