package Math;

//good number: even indices can contain only evens, odd indices can contain only primes
//find total number of good numbers of length n

public class CountGoodNumbers {
    long mod=1000000007;
    public int countGoodNumbers(long n) {
        long even=(n+1)/2;
        long odd=n/2;
        long ans=(myPow(5,even) * myPow(4,odd))%mod;
        return (int)ans;
    }
    public long myPow(long x, long n) {
        long ans=1;
        long n1=n;
        x=x%mod;

        while(n1>0){
            if(n1%2==0){
                x=(x*x)%mod;
                n1=n1/2;
            }
            else{
                ans=(ans*x)%mod;
                n1=n1-1;
            }
        }
        return ans;
    }
}
