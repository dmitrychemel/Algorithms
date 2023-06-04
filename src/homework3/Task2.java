package homework3;

/**
 * Algorithms. Homework #3
 * @author Dmitry Chemel
 * @version 30 May 2023
 */

public class Task2 {
    public static void main(String[] args) {
        int a = 14;
        int b = 3;
//        evklida(a,b);
        System.out.println(evklida(a,b));
    }

    public static int evklida(int a, int b) {
        if(a == b) {
            return a;
        } else if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else if (a > b) {
            return evklida(a-b,b);
        } else {
            return evklida(a,b-a);
        }
    }
}
