package Math;

import java.util.ArrayList;
import java.util.List;

public class PrintPrimeFactors {
    public int[] AllPrimeFactors(int N)
    {
        List<Integer> list=new ArrayList<>();
        for(int i=2;i*i<=N;i++){
            if(N%i==0){
                list.add(i);
                while(N%i==0) N=N/i;
            }
        }
        if(N!=1) list.add(N);
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++) 
            ans[i] = list.get(i);
        return ans;
    }
}
