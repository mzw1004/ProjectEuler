/**
* The sum of the squares of the first ten natural numbers is,
* 12 + 22 + ... + 102 = 385
* The square of the sum of the first ten natural numbers is,
* (1 + 2 + ... + 10)2 = 552 = 3025
* Hence the difference between the sum of the squares of the 
* first ten natural numbers and the square of the sum is 
* 3025 - 385 = 2640.
* Find the difference between the sum of the squares of the 
* first one hundred natural numbers and the square of the sum.
*
* Answer: 25164150
*/

public class Problem6 {

    public static void main(String[] args) {
        long sum_of_squares = 0;
        long squares_of_sum = 0;
        long difference = 0;

        for (int num = 1; num <= 100; num ++) {
            sum_of_squares += (num * num);
            squares_of_sum += num;
        }
        squares_of_sum *= squares_of_sum;

        difference = squares_of_sum - sum_of_squares;
        System.out.printf("The difference = %d\n", difference);
    }
}