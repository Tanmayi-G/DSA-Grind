package BitManipulation;

public class Number_of_set_bits {
    public int hammingWeight(int n) {
        int cnt=0;
        while(n>1){
            if(n%2==1) cnt++;
            n/=2;
        }
        if(n==1) cnt++;
        return cnt;
    }
}
