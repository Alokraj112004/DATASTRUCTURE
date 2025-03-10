package twodimensionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class Twodimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] marks = new double[2][];
//        for(double element[] : marks){
//            for(double i : element){
//                System.out.println(i);
//            }
//        }
        marks[0] = new double[3];
        marks[1] = new double[5];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.println("enter the numbers");
                marks[i][j] = sc.nextDouble();
            }
        }
        System.out.println(Arrays.deepToString(marks)); //this will give string form we dp't use for and foreach loop
    }
}
