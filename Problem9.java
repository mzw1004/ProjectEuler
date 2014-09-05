/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a * a + b * b = c * c
 * For example, 3 * 3 + 4 * 4 = 9 + 16 = 25 = 5 * 5.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 *
 * Answer: 31875000
 */


public class Problem9 {

    public static void main(String[] args) {
        for (int a = 1; a < 333; a += 1) {
            for (int b = a + 1; b < 500; b += 1) {
                int c = 1000 - a - b;
                if (a * a + b * b == c * c) {
                    System.out.println(a + " " + b + " " + c);
                    System.out.println("product = " + (a * b * c));
                }
            }
        }
    }
}
