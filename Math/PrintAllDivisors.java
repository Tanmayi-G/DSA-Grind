package Math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintAllDivisors {
    public static void print_divisors(int n) {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                list.add(i);
                if(n/i!=i) list.add(n/i);
            } 
        }
        Collections.sort(list);
        for(Integer i : list) System.out.print(i + " ");
    }
}
