package homework8;

import java.util.Arrays;

public class RubberArray {
    public static void main(String[] args) {
        int[] array = new int[]{0,1,2,3,4,5,6};
        int n = 5;

        int[] arrayN = addElements(array,n);
        System.out.println(Arrays.toString(arrayN));
    }

    private static int[] addElements(int[] array, int n) {
        int[] newArray = new int [array.length + n];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }
}
