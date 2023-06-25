package homework7;

import java.util.Arrays;

public class SumNum {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4};
        System.out.println((Arrays.toString(sumNum(array))));
    }

    public static int[] sumNum(int[] array){
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i] + array[i-1];
        }
        return array;
    }
}

