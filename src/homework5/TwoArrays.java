package homework5;

public class TwoArrays {
    public static void main(String[] args) {
        int[] array1 = new int[]{100, 112, 256, 349, 770};
        int[] array2 = new int[]{72, 86, 113, 119, 265, 445, 892};
        System.out.println(findK(7, array1, array2));
    }

    public static int findK(int k, int[] array1, int[] array2) {
        int pointer1 = 0;
        int pointer2 = 0;
        int count = 0;
        int[] result = new int[k+1];
        while(count <= k){
            if(array1[pointer1] <= array2[pointer2]){
                result[count] = array1[pointer1];
                pointer1++;
                count++;
            } else {
                result[count] = array2[pointer2];
                pointer2++;
                count++;
            }
        }
        return result[k];
    }
}
