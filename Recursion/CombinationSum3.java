package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        f(1,list,n,k,ans);
        return ans;
    }
    //f(startInd,[],sum,k)
    void f(int startInd,List<Integer> list,int sum,int k,List<List<Integer>> ans){
        if(sum==0 && list.size()==k){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(sum<0 || list.size()>k) return;

        for(int i=startInd;i<=9;i++){
            list.add(i);
            f(i+1,list,sum-i,k,ans);
            list.removeLast();
        }
    }
}
