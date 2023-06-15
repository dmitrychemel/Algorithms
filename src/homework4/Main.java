package homework4;

public class Main {
    public static void main(String[] args) {
        int n = 4;
        hanoi(4,"pole 1", "pole 2", "pole 3");

    }

    public static void hanoi(int n, String from, String tmp, String to) {
        if(n == 1) {
            System.out.printf("Перемести из %s, в %s%n", from, to);
            return;
        }
        hanoi(n-1, from, to, tmp);
        System.out.printf("Перемести из %s, в %s%n", from, to);
        hanoi(n-1, tmp, from, to);
    }
}
