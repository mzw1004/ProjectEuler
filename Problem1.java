/**
*If we list all the natural numbers below 10 that 
*are multiples of 3 or 5, we get 3, 5, 6 and 9. The
*sum of these multiples is 23. Find the sum of all 
*the multiples of 3 or 5 below 1000.
*/

public class Problem1 {

    public static void main(String[] args) {
        int sum = 0;

        for (int num = 0; num < 1000; num++) {
            if (num % 3 == 0 || num % 5 == 0) {
                sum = sum + num;
            }
        }

        System.out.printf("The sum = %d", sum);
        System.out.println();
    }
}