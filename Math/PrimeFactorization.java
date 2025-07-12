package Math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFactorization {
    private static final int MAX_N = 100000;
    private int[] SPF = new int[MAX_N + 1];

    public PrimeFactorization() {
        Arrays.fill(SPF, 1);
    }

    private void sieve() {
        for (int i = 2; i <= MAX_N; i++) {
            if (SPF[i] == 1) {
                for (int j = i; j <= MAX_N; j += i) {
                    if (SPF[j] == 1) {
                        SPF[j] = i;
                    }
                }
            }
        }
    }

    private List<Integer> primeFact(int n) {
        List<Integer> ans = new ArrayList<>();
        while (n != 1) {
            ans.add(SPF[n]);
            n = n / SPF[n];
        }
        return ans;
    }

    public List<List<Integer>> primeFactors(int[] queries) {
        sieve();
        List<List<Integer>> ans = new ArrayList<>();
        for (int query : queries) {
            ans.add(primeFact(query));
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] queries = {2, 3, 4, 5, 6};

        PrimeFactorization sol = new PrimeFactorization();

        List<List<Integer>> ans = sol.primeFactors(queries);

        System.out.println("The prime factorization of all the numbers is: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("For " + queries[i] + ": ");
            for (int factor : ans.get(i)) {
                System.out.print(factor + " ");
            }
            System.out.println();
        }
    }
}
