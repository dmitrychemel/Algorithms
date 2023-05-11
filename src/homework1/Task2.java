package homework1;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*(100+1));
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        int result = sum/ array.length;
        System.out.println(result);
    }
}

// 32 операций - 10 постановка рандомных чисел в массив | 10 перебрать массив | 10 сложение | деление | вывод
//

// память - вроде массив 8 байт, а инт 4*2 байта = 16 байт