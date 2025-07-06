package BinarySearch;

public class SqrtOfANumber {
    public long floorSqrt(long n) {
        long ans = 0;
        
        for (long i = 1; i <= n; i++) {
            long val = i * i;
            if (val <= (long) n) {
                ans = (int) i; 
            } 
            else {
                break; 
            }
        }
        
        return ans;
    }
}
