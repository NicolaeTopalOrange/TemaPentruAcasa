package homework_lesson_four;

import java.util.Arrays;

public class TemaDeAcasa4f {
    public static void main(String[] args) {
//        Write a Java program to merge two sorted arrays into a single sorted array.
        int[] arrayA = {55, 65, 98, 8, 75};
        int[] arrayB = {50, 6, 9, 44, 61};
        int[] mergedArray = new int[arrayA.length + arrayB.length];
        int i = 0;
        for (int element : arrayA) {
            mergedArray[i] = element;
            i++;
        }
        for (int element : arrayB) {
            mergedArray[i] = element;
            i++;
        }
        Arrays.sort(mergedArray);
        System.out.println(Arrays.toString(mergedArray));
    }

}

