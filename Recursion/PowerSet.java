package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        f(0,list,ans,nums);
        return ans;
    }
    //f(ind,[])
    void f(int ind,List<Integer> list,List<List<Integer>> ans,int[] nums){
        if(ind==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[ind]);
        f(ind+1,list,ans,nums);

        list.removeLast();
        f(ind+1,list,ans,nums);
    }
}
