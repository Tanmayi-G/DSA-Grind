package BinarySearch;

public class FindNthRoot {
    private long Pow(int b, int exp) {
        long ans = 1;
        long base = b;

        while (exp > 0) {
            if (exp % 2 == 1) {
                exp--;
                ans *= base;
            } else {
                exp /= 2;
                base *= base;
            }
        }
        return ans;
    }

    public int NthRoot(int N, int M) {
        for (int i = 1; i <= M; i++) {
            long val = Pow(i, N);
            if (val == M) {
                return i;
            } else if (val > M) {
                break;
            }
        }
        return -1;
    }
}
