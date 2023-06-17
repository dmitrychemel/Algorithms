package homework5;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 6, 9, 3, 2, 4, 5, 1, 6};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int from, int to){
       if(from < to){
           int mediumIndex = partition(array, from, to);
           quickSort(array, from,mediumIndex - 1);
           quickSort(array, mediumIndex, to);
       }
    }

    private static int partition(int[] array, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;

        int pivot = array[(to + from)/2];
        while(leftIndex <= rightIndex){
            while (array[leftIndex] < pivot){
                leftIndex++;
            }

            while (array[rightIndex] > pivot){
                rightIndex--;
            }

            if(leftIndex <= rightIndex){
                swap(array, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap(int[] array, int rightIndex, int leftIndex){
        int tmp = array[rightIndex];
        array[rightIndex] = array[leftIndex];
        array[leftIndex] = tmp;
    }
}
