/**
*Each new term in the Fibonacci sequence is generated 
*by adding the previous two terms. By starting with 1 
*and 2, the first 10 terms will be:
*1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
*By considering the terms in the Fibonacci sequence 
*whose values do not exceed four million, find the sum 
*of the even-valued terms.
*
*Answer: 4613732
*/

public class Problem2 {

    public static long fibonacci(int num) {
        if (num == 1 || num == 2) {
            return num;
        }
        else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }

    public static void main(String[] args) {
        final int END = 4000000;
        long sum = 0;

        for (int n = 1; fibonacci(n) < END; n++) {
            if (fibonacci(n) % 2 == 0) {
                sum += fibonacci(n);
            }
        }
        System.out.println(sum);
    }
}