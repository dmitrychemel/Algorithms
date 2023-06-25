package homework6;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arrayFirst = new int[]{100, 112, 256, 349, 770};
        int[] arraySecond = new int[]{72, 86, 113, 119, 265, 445, 892};
        System.out.println(Arrays.toString(merge(arrayFirst, arraySecond)));
    }

    public static int[] merge(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                result[k] = array1[i];
                i++;
            } else {
                result[k] = array2[j];
                j++;
            }
            k++;
        }

        while (i < array1.length) {
            result[k] = array1[i];
            i++;
        }

        while (j < array2.length) {
            result[k] = array2[j];
            j++;
        }
        return result;
    }
}
