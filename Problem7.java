/**
* By listing the first six prime numbers: 
* 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
* What is the 10 001st prime number?
*
*Answer: 104743
*/

import java.util.Arrays;

public class Problem7 {

    public static boolean isPrime(long num) {
        if (num == 2) 
            return true;
        else if (num % 2 == 0) 
            return false;
        else {
            for (int i = 3; i * i <= num; i += 2) {
                if (num % i == 0)
                    return false;
            }
        }
        return true;
    }

    public static long prime(int index) {
        long list[] = new long[index];
        list[0] = 2;
        long num = 3;
        boolean isPrime = true;

        for (int i = 1; i < index; i++) {
            for (int j = 0; j < i; j++) {
                if (num % list[j] == 0) {
                    isPrime = false;
                    i -= 1;
                    break;
                }
            }
            if (isPrime) {
                list[i] = num;
            }             
            num += 2;
            isPrime = true;
        }

        return list[index - 1];
    }

    public static void main(String[] args) {
        int idx = 1;
        long num = 2;
        while (idx <= 10001) {
            if (isPrime(num)) {
                idx += 1;
            }
            num += 1;
        }
        System.out.println(num - 1);
        System.out.println(prime(10001));
    }
}