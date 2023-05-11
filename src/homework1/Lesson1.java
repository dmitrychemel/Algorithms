package homework1;

public class Lesson1 {
    public static void main(String[] args) {
        int[] arrays = new int[10];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (int)(Math.random()*(200+1))-100;
        }

        int positiveSum = 0;
        for (int i = 0; i < arrays.length; i++) {
            if(arrays[i]>0){
                positiveSum = positiveSum + arrays[i];
            }
        }
        System.out.println(positiveSum);
    }
}
 // 21 операций - 10 постановка рандомных чисел в массив | 10 поиска положительных значений | возможно еще нужно считать сумму,
 //  но я там не знаю кол-во операций | вывод

// память - вроде массив 8 байт, а инт 4 байта = 12 байт, но разницы не имеет так как джава все равно приведет к 16 байтам