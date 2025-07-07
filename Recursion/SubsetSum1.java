package Recursion;

import java.util.ArrayList;

public class SubsetSum1 {
    public ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> ans=new ArrayList<>();
        f(0,0,arr,ans);
        return ans;
    }
    
    //f(ind,sum)
    void f(int ind,int sum,int[] arr,ArrayList<Integer> ans){
        if(ind==arr.length){
            ans.add(sum);
            return;
        }
        
        f(ind+1,sum+arr[ind],arr,ans);
        
        f(ind+1,sum,arr,ans);
    }
}
