package homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstSide = scan.nextInt();
        int secondSide = scan.nextInt();
        int thirdSide = scan.nextInt();
        scan.close();

        boolean first = firstSide < secondSide + thirdSide;
        boolean second = secondSide < firstSide + thirdSide;
        boolean third = thirdSide < secondSide + firstSide;

        if(first){
            if(second){
                if(third){
                    System.out.println("Такой треугольник существует");
                }
                else{
                    System.out.println("Такой треугольник не существует");
                }
            }
            else{
                System.out.println("Такой треугольник не существует");
            }
        }
        else{
            System.out.println("Такой треугольник не существует");
        }
    }
}
