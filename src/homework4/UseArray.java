package homework4;

import java.util.Arrays;

/**
 * Algorithms. Homework #4
 * @author Dmitry Chemel
 * @version 04 June 2023
 */

public class UseArray {
    public static void main(String[] args) {
        int[] array = {1, 6, 7, 8,11, 22, 66, 33 ,5};
        int[] array1 = {1, 6, 7, 8,11, 22, 66, 33 ,5};
        sortedInsertion(array);
        sortedSelection(array1);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
    }

    public static void sortedSelection(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            int minPos = i;
            for (int j = i + 1; j < array.length ; j++) {
                if(array[j] < array[minPos]){
                    minPos = j;
                }
            }

            int temp = array[minPos];
            array[minPos] = array[i];
            array[i]=temp;
        }
    }

    public static void sortedInsertion(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i;

            while (j > 0 && array[j-1] > current){
                array[j] = array[j - 1];
                j--;
            }
            array[j] = current;
        }
    }
}
