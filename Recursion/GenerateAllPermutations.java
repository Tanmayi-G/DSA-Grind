package Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllPermutations {
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        boolean[] indMap=new boolean[arr.length];
        f(indMap,list,ans,arr);
        return ans;
    }
    //f(ind[],[])
    void f(boolean[] indMap,List<Integer> list,List<List<Integer>> ans,int[] arr){
        if(list.size()==arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=0;i<arr.length;i++){
            if(indMap[i]==true) continue;

            indMap[i]=true;
            list.add(arr[i]);
            f(indMap,list,ans,arr);

            indMap[i]=false;
            list.removeLast();
        }
    }
}
