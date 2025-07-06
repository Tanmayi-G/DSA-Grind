package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum1 {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        f(0,list,target,ans,arr);
        return ans;
    }
    //f(i,[],target)
    void f(int ind, List<Integer> list, int target, List<List<Integer>> ans, int[] arr){
        if(target==0){
            ans.add(new ArrayList<>(list));
            return;
        } 
        if(target<0 || ind==arr.length) return;
        
        list.add(arr[ind]);
        f(ind,list,target-arr[ind],ans,arr);

        list.removeLast();
        
        f(ind+1,list,target,ans,arr);
    }
}
