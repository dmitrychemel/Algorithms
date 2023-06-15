package homework5;

public class Power {
    public static void main(String[] args) {

    }

    public static int power(int x, int n){
        if(n == 1){
            return x;
        }
        if(n % 2 == 0){
            int tmp = power(x, n / 2);
            return tmp * tmp;
        } else {
            int tmp = power(x, (n - 1) / 2);
            return x * tmp * tmp;
        }
    }
}
