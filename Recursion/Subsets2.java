package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2 {
    public List<List<Integer>> subsetsWithDup(int[] arr) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        Arrays.sort(arr);
        f(0,list,ans,arr);
        return ans;
    }
    //f(ind,[])
    void f(int ind,List<Integer> list,List<List<Integer>> ans,int[] arr){
        if(ind==arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        list.add(arr[ind]);
        f(ind+1,list,ans,arr);
        list.removeLast();

        ind++;
        while(ind<arr.length && arr[ind]==arr[ind-1]) ind++;
        f(ind,list,ans,arr);
    }
}
