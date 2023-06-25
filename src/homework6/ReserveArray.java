package homework6;

import java.util.Arrays;

public class ReserveArray {
    public static void main(String[] args) {
        String[] word = new String[]{"п","р","и","в","е","т"};
        System.out.println(Arrays.toString(reserveArray(word,0,word.length - 1)));

    }

    public static String[] reserveArray(String[] array, int from, int to){
        int rightIndex = to;
        int leftIndex = from;

        int pivot = (to + from) / 2;
        while(leftIndex <= rightIndex){
            String tmp = array[rightIndex];
            array[rightIndex] = array[leftIndex];
            array[leftIndex] = tmp;
            rightIndex--;
            leftIndex++;
        }
        return array;
    }
}
