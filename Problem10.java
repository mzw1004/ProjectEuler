/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 *
 * Answer: 142913828922
 */


public class Problem10 {

    public Boolean[] findAllPrimesBelow(int max) {
        Boolean[] primes = new Boolean[max];
        for (int i = 0; i < max; i += 1) {
            primes[i] = true;
        }
        primes[0] = false;
        primes[1] = false;

        for (int i = 2; i < Math.sqrt(max); i += 1) {
            if (primes[i]) {
                for (int j = i * i; j < max; j += i) {
                    primes[j] = false;
                }
            }
        }

        return primes;
    }

    public long computeSum(Boolean[] primes) {
        long sum = 0;
        for (int i = 0; i < primes.length; i += 1) {
            if (primes[i]) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Problem10 problem = new Problem10();
        Boolean[] primes = problem.findAllPrimesBelow(2000000);
        long result = problem.computeSum(primes);
        System.out.println(result);
    }
}
