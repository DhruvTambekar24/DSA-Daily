class Solution {
    private boolean[] sieve(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        if (n >= 0) prime[0] = false;
        if (n >= 1) prime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }
        return prime; 
    }
    public int largestPrime(int n) {
       int latrevison = n; 
        boolean[] isPrime = sieve(n);
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) primes.add(i);
        }
        long sum = 0;
        int largest = 0;

        for (int p : primes) {
            sum += p;
            if (sum > n) break;
            if (isPrime[(int) sum]) {
                largest = (int) sum;
            }
        }
        return largest;
    }
}