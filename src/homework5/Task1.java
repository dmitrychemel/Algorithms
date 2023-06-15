package homework5;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int []{1, 1, 2, 2, 2, 2, 3, };
        getNumberCount(array, 2);
    }

    public static int getNumberCount(int[] array,int x){
        System.out.println(searchLeft(x, array, 0, array.length));
        System.out.println(searchRight(x, array, 0, array.length));
        int left = searchLeft(x, array, 0, array.length);
        if(left != -1){
            int right = searchRight(x, array, 0, array.length);
            return right-left;
        } else {
            return -1;
        }
    }
    public static int searchLeft(int number, int[] array, int from, int to) {
        if(to<= from){
            return number == array[from]? from : -1;
        }

        int middle = (from + to) / 2;

        if(array[middle] < number){
            return searchLeft(number,array, middle + 1, to);
        } else {
            return searchLeft(number,array, from,middle);
        }
    }

    public static int searchRight(int number, int[] array, int from, int to) {
        if(to <= from){
            return from;
        }
        int middle = (from + to) / 2;

        if(array[middle] > number){
            return searchRight(number,array, from,middle);
        } else {
            return searchRight(number,array, middle + 1, to);
        }
    }
}
