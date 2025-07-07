package Recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        if(digits.length()==0) return ans;
        String[] map = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        f(0,"",digits,map,ans);
        return ans;
    }
    //f(ind,[])
    void f(int ind,String s,String digits,String[] map,List<String> ans){
        if(ind==digits.length()){
            ans.add(s);
            return;
        }

        String letters=map[digits.charAt(ind)-'0'];
        for(char ch:letters.toCharArray()){
            f(ind+1,s+ch,digits,map,ans);
        }
    }
}
