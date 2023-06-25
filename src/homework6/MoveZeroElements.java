package homework6;

import java.util.Arrays;

public class MoveZeroElements {
    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 0, 3, 12};
        move(array);
        System.out.println(Arrays.toString(array));
    }

    public static void move(int[] array) {
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[index] = array[i];
                index++;
            }
        }

        while (index < array.length) {
            array[index] = 0;
            index++;
        }
    }
}
