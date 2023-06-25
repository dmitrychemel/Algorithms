package homework7;

import java.util.ArrayList;
import java.util.List;


public class NumPaskal {

    static final String SPACE = " ";

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> pascalTriangle = pascalTriangle(numRows);
        for (List<Integer> row : pascalTriangle) {
            for (Integer num : row) {
                System.out.print(num + SPACE);
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> pascalTriangle(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();

        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(i - 1);

            row.add(1);

            for (int j = 1; j < i; j++) {
                int num = prevRow.get(j - 1) + prevRow.get(j);
                row.add(num);
            }

            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }

}
