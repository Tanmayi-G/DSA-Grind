package Math;

import java.util.Arrays;

public class CountPrimes_SieveOfEratosthenes {
    public int countPrimes(int n) {
        if(n<=2) return 0;

        boolean[] prime=new boolean[n+1];
        Arrays.fill(prime,true);
        
        for(int i=2;i*i<=n;i++){
            if(prime[i]){
                for(int j=i*i;j<=n;j+=i){
                    prime[j]=false;
                }
            }
        }
        int cnt=0;
        for(int i=2;i<n;i++){
            if(prime[i]) cnt++;
        }
        return cnt;
    }
}
