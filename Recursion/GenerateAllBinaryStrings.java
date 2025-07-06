package Recursion;

import java.util.ArrayList;
import java.util.List;
 
//generate all binary strings having no consecutive 1s

public class GenerateAllBinaryStrings {
    public static List<String> generateBinaryStrings(int n) {
        List<String> ans=new ArrayList<>();
        f(0,"",n,ans,'0');
        return ans;
    }
    
    //f(ind,[],n)
    static void f(int ind,String s,int n,List<String> ans,char lastChar){
        if(ind==n){
            ans.add(s);
            return;
        }
        
        f(ind+1,s+'0',n,ans,'0');
        
        if(lastChar!='1'){
            f(ind+1,s+'1',n,ans,'1');
        }
    }
}
