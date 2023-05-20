package homework2;

import java.util.Arrays;

public class CreateArray {
    private int[] array;
    private boolean sorted;

    public CreateArray() {
        array = new int[0];
        sorted = false;
    }

    public void add(int value) {
        int[] newArray = new int[array.length+1];
        System.arraycopy(array,0, newArray, 0, array.length);
        newArray[array.length] = value;
        array = newArray;
    }

    public void sortedArray() {
        int temp = 0;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if(array[i]>array[i+1]){
                    sorted = false;

                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Array{" +
                "array=" + Arrays.toString(array) +
                ", sorted=" + sorted +
                '}';
    }
}
