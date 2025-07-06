package Recursion;

import java.util.ArrayList;
import java.util.List;

//Given n pairs of parentheses, generate all combinations of well-formed parentheses

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        f(0,"",n,0,ans);
        return ans;
    }
    //f(ind,[],n)
    void f(int ind,String s,int n,int open,List<String> ans){
        if(ind==2*n){
            ans.add(s);
            return;
        }

        if(open<n){
            f(ind+1,s+'(',n,open+1,ans);
        }

        int close=ind-open;
        if(close<open){
            f(ind+1,s+')',n,open,ans);
        }
    }
}
