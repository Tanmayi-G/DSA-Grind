package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    class Solution {
    public List<List<String>> partition(String s) {
        List<String> list=new ArrayList<>();
        List<List<String>> res=new ArrayList<>();
        f(0,list,res,s);
        return res;
    }
    //f(ind,[])
    void f(int ind,List<String> list, List<List<String>> res, String s){
        if(ind==s.length()){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=ind;i<s.length();i++){
            if(!isPalindrome(s,ind,i)) continue;
            
            list.add(s.substring(ind,i+1));
            f(i+1,list,res,s);
            list.removeLast();
        }
    }
    boolean isPalindrome(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--))
                return false;
        }
        return true;
    }
}
}
