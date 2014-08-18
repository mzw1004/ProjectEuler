/**
* 2520 is the smallest number that can be divided by 
* each of the numbers from 1 to 10 without any remainder.
* What is the smallest positive number that is evenly 
* divisible by all of the numbers from 1 to 20?
*
*Answer: 232792560
*/

public class Problem5 {

    public long getGCD(long num1, long num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        else {
            return getGCD(num2, num1 % num2);
        }
    }

    public long getLCM(long num1, long num2) {
        return num1 * num2 / getGCD(num1, num2);
    }

    public static void main(String[] args) {
        Problem5 problem = new Problem5();
        long answer = 1;
        for (long num = 1; num <= 20; num ++) {
            answer = problem.getLCM(answer, num);
        }
        System.out.println(answer);
    }
}