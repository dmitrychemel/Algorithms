package homework7;

public class Multiple {
    public static void main(String[] args) {
        int m = 7;
        int find = findMultiple(m);
        System.out.println(find);
    }

    public static int findMultiple(int n) {
        int m = n;
        while ( m % 3 != 0) {
            m = m + n;
        }
        return m;
    }
}
