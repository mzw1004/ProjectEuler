/**
* The prime factors of 13195 are 5, 7, 13 and 29.
* What is the largest prime factor of the number 600851475143 ?
*
* Answer: 6857
*/

public class Problem3 {

    public static void main(String[] args) {
        final Long NUM = 600851475143L;
        Long n = NUM;

        for (int i = 2; n > 1; i++) {
            if (n % i == 0) {
                System.out.println(i);
                n /= i;
                i --;
            }
        }
    }
}