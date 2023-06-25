package homework6;

public class PeakNumberArray {
    public static void main(String[] args) {
        int[][] array = new int[][]{
                {10, 20, 15},
                {21, 30, 14},
                {7, 16, 32}
        };
        System.out.println(findPeak(array, 0,array[0].length));
    }

    public static int findPeak(int[][] array, int from, int to) {
        int median = (from + to) / 2;
        int maxIndex = findMaxIndex(array, median);
        int val = array[maxIndex][median];
        if (median == 0 || median == array[0].length - 1) {
            return val;
        }
        if (val >= array[maxIndex][median - 1] && val >= array[maxIndex][median + 1]) {
            return val;
        }

        if (val < array[maxIndex][median - 1]) {
            return findPeak(array, from, median - 1);
        } else {
            return findPeak(array, median + 1, to);
        }
    }

    public static int findMaxIndex(int[][] array, int column) {
        int max = -1;
        int maxIndex = -1;
        for (int i = 0; i < array[0].length; i++) {
            if (array[i][column] > max) {
                max = array[i][column];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
