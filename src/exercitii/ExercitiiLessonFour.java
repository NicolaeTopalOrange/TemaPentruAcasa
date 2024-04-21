package exercitii;

import java.util.Arrays;
import java.util.Scanner;

public class ExercitiiLessonFour {
    public static void main(String[] args) {
////        int[] test = {1, 7, 9, 15, 88};
////        for (int i = 3; i< test.length; i++){
////            System.out.println(test[i-1]);
////        }
//        int[] masivUnu = {5, 5, 4, 10, 1};
//        int min = masivUnu[0];
////        for (int x = 0; x < masivUnu.length; x++) {
////            System.out.println(masivUnu[x]+masivDoi[x]);
////        }
//        for (int x = 1; x < masivUnu.length; x++) {
//            min= Math.min(min,masivUnu[x]);
//        }
//        System.out.println(min);

//        String[] array= {"Java", "C++", "Pascal"};
////        for (int i=0; i<array.length; i++);
//        for (String i :array) {
//            System.out.println(i);
//        }
////        ultima valoare din array
//        int[] array = {3, 7, 8, 9};
//        System.out.println(array[array.length-1]);

        //      afisarea inputului intr-un array int
//        Scanner scanner = new Scanner(System.in);
//        double[] arr = new double[2];
//        for (int i =0; i< arr.length; i++){
//            System.out.println("Input nr: ");
//            arr[i]= scanner.nextDouble();
//        }
//        for (double b :arr) {
//            System.out.println(b);
//        }
//      afisarea inputului intr-un array String
//        Scanner scanner = new Scanner(System.in);
//        String[] arr = new String[3];
//        for (int i =0; i< arr.length; i++){
//            System.out.println("Input line: ");
//            arr[i]= scanner.nextLine();
//        }
//        for (String b :arr) {
//            System.out.println(b);
//        }
//    }
//    multidimensional array
//        int[][] nr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}};
//        System.out.println(nr[1][2]);

//        copy of range
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println("Enter name of arr lenght");
        int[] copy = Arrays.copyOfRange(array, 0, 3);
        int[] copy1 = Arrays.copyOfRange(array, 4, 6);
        int sum1 =0;
        int sum2= 0;
        for (int i=0; 1<copy.length;i++){
            sum1 +=copy[1];
            sum2 +=copy1[1];
        }
        System.out.println();




        }



//;;        12345  0
//        6789   1   012 =8




    }


