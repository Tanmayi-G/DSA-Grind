package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ReversePairs {
    int cnt=0;
    public int reversePairs(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return cnt;
    }
    public void mergeSort(int[] nums,int low,int high){
        if(low>=high) return;
        int mid=(low+high)/2;
        mergeSort(nums,low,mid);
        mergeSort(nums,mid+1,high);
        countPairs(nums,low,mid,high);
        merge(nums,low,mid,high);
    }
    public void countPairs(int[] nums,int low,int mid,int high){
        int right=mid+1;
        for(int i=low;i<=mid;i++){
            while(right<=high && nums[i]>(2*(long)nums[right]))
                right++;
            cnt+=(right-(mid+1));
        }
    }
    public void merge(int[] nums,int low,int mid,int high){
        List<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                temp.add(nums[left]);
                left++;
            }else{
                temp.add(nums[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(nums[left]);
            left++;
        }
        while(right<=high){
            temp.add(nums[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            nums[i]=temp.get(i-low);
        }
    }
}
