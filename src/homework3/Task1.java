package homework3;

/**
 * Algorithms. Homework #3
 * @author Dmitry Chemel
 * @version 28 May 2023
 */

public class Task1 {
    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println(result);
    }

    public static int factorial(int n){
        if(n <= 1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
