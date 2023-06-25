package homework6;

public class PeakNumber {
    public static void main(String[] args) {
        int[] array = new int[]{10, 20, 15, 2, 23, 90, 67};
        int peakIndex = findPeak(array, 0, array.length);
        System.out.println(peakIndex);

    }

    public static int findPeak(int[] array, int from, int to){
        int median = (from+ to)/2;
        int val = array[median];
        if(median == 0 || median == array.length - 1){
            return val;
        }
        if(val >= array[median - 1] && val >= array[median+1]){
            return val;
        }

        if(val < array[median -1 ]){
            return findPeak(array, from, median - 1);
        } else {
            return findPeak(array, median + 1, to);
        }
    }
}
