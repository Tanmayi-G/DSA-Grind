package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> subList=new ArrayList<>();
        Arrays.sort(arr);
        f(0,target,list,subList,arr);
        return list;
    }

    //f(startInd,[],target)
    void f(int ind,int target,List<List<Integer>> list,List<Integer> subList,int[] arr){
        if (target == 0) {
            list.add(new ArrayList<>(subList));
            return;
        }

        if (target < 0 || ind == arr.length) return;

        subList.add(arr[ind]);
        target-=arr[ind];
        f(ind+1,target,list,subList,arr);

        subList.removeLast();
        target+=arr[ind];
        
        ind++;
        while(ind<arr.length && arr[ind]==arr[ind-1]) ind++;
        f(ind,target,list,subList,arr);

        return;
    }
}
