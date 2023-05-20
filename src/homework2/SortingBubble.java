package homework2;

/**
 * Java. Homework #2
 * @author Dmitry Chemel
 * @version 20 May 2023
 */

public class SortingBubble {
    public static void main(String[] args) {
        CreateArray array = new CreateArray();
        array.add(45);
        array.add(-5);
        array.add(1);
        array.add(-45);
        array.add(8);
        System.out.println(array);

        array.sortedArray();
        System.out.println(array);
    }
}
