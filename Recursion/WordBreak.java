package Recursion;

import java.util.List;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        return f(0,s,wordDict);
    }
    
    //f(startInd,s)
    boolean f(int startInd,String s,List<String> wordDict){
        if(startInd==s.length()){
            return true;
        }

        for(int i=startInd+1;i<=s.length();i++){
            if(wordDict.contains(s.substring(startInd,i)) && f(i,s,wordDict)) return true;
        }

        return false;
    }
}
