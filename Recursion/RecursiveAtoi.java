package Recursion;

public class RecursiveAtoi {
    public int myAtoi(String s) {
        if(s==null) return 0;

        //check whitespaces
        s=s.trim();
        if(s.length()==0) return 0;

        //check sign
        int sign=1;
        int i=0;
        if(s.charAt(0)=='-' || s.charAt(0)=='+'){
            sign=(s.charAt(0)=='-') ? -1 : 1;
            i=1;
        }
        return sign*recursiveAtoi(s,i,0,sign);
    }

    private int recursiveAtoi(String s, int i, int ans, int sign) {
        int MAX = Integer.MAX_VALUE;
        int MIN = Integer.MIN_VALUE;

        // Base case: reached end or non-digit character
        if(i>=s.length() || !Character.isDigit(s.charAt(i))){
            return ans;
        }

        int digit=s.charAt(i)-'0';

        // Overflow check
        if(ans>(MAX-digit)/10){
            return (sign==1) ? MAX : MIN;
        }

        ans=ans*10 + digit;
        return recursiveAtoi(s,i+1,ans,sign);
    }
}

