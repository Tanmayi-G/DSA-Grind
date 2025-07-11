package BitManipulation;

public class Divide_two_integers {
    public int divide(int dividend, int divisor) {
        if(dividend==divisor) return 1;

        boolean sign=true;
        if(dividend>=0 && divisor<0) sign=false;
        if(dividend<=0 && divisor>0) sign=false;

        long n=Math.abs((long)dividend);
        long d=Math.abs((long)divisor);
        long ans=0;

        while(n>=d){
            int cnt=0;
            while(n>=(d<<(cnt+1)))
                cnt++;
            ans+=(1<<cnt);
            n-=(d<<cnt);
        }
        if(sign==true && ans==(1<<31)) return Integer.MAX_VALUE;
        if(sign==false && ans==(1<<31)) return Integer.MIN_VALUE;
        return sign?(int)ans:(int)-ans;
    }
}
