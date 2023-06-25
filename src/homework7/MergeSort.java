package homework7;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = new int[]{7, 31, 24, 12, 66, 81, 23, 1, 3};
        System.out.println(Arrays.toString(mergeSort(array, 0, array.length - 1)));
    }

    private static int[] mergeSort(int[] array, int from, int to) {
        if (to <= from) {
            return new int[]{array[from]}; // 1 elem
        }
        int middle = (to + from) / 2; // 5
        int[] left = mergeSort(array, from, middle);// 5
        int[] right = mergeSort(array, middle + 1, to);
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        var firstPointer = 0;
        var secondPointer = 0;
        int mainPointer = 0;
        var array = new int[left.length + right.length];
        while (firstPointer < left.length && secondPointer < right.length) {
            if (left[firstPointer] > right[secondPointer]) {
                array[mainPointer] = right[secondPointer];
                mainPointer++;
                secondPointer++;
            } else {
                array[mainPointer] = left[firstPointer];
                mainPointer++;
                firstPointer++;
            }
        }

        while (firstPointer < left.length) {
            array[mainPointer] = left[firstPointer];
            mainPointer++;
            firstPointer++;
        }
        while (secondPointer < right.length) {
            array[mainPointer] = right[secondPointer];
            mainPointer++;
            secondPointer++;
        }

        return array;
    }

}
