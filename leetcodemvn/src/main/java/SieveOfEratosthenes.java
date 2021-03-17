import java.util.ArrayList;
import java.util.List;

// More information: https://vnoi.info/wiki/translate/he/Number-Theory-2
public class SieveOfEratosthenes {

// Java program to print all primes smaller than or equal to
// n using Sieve of Eratosthenes
    public static class Solution {

        public List<Integer> sieveOfEratosthenes(int n) {
            boolean[] primes = new boolean[n + 1];
            for (int i = 0; i < primes.length; i++) {
                primes[i] = true;
            }

            int squareRoot = (int) Math.sqrt(n);

            for (int p = 2; p <= squareRoot; p++) {
                if (primes[p]) {
                    for (int i = p * p; i <= n; i += p) {
                        primes[i] = false;
                    }
                }
            }
            List<Integer> ans = new ArrayList<>();
            for (int i = 2; i <= n; i++) {
                if (primes[i]) {
                    ans.add(i);
                }
            }
            return ans;
        }
    }

}
