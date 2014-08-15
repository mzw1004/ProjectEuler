/**
* A palindromic number reads the same both ways. The largest 
* palindrome made from the product of two 2-digit numbers is 
* 9009 = 91 × 99.
* Find the largest palindrome made from the product of two 
* 3-digit numbers.
*
* Answer: 906609
*/

public class Problem4 {

    public static boolean canBeDivided(int num) {
        for (int i = 100; i < 1000; i++) {
            if (num % i == 0 && num / i < 1000 && num / i > 99) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        for (int a = 9; a > 0; a--) {
            for (int b = 9; b >= 0; b--) {
                for (int c = 9; c >= 0; c--) {
                    int num = 100001 * a + 10010 * b + 1100 * c;
                    if (canBeDivided(num)) {
                        System.out.println(num);
                        return;
                    }
                }
            }
        }
    }
}