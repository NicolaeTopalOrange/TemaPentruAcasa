package homework_lesson_four;

import java.util.Arrays;
import java.util.Collections;

public class TemaDeAcasa4b {
        public static void main(String[] args) {
                //    Write a Java program to sort an array of integers in ascending and descending order.
                Integer[] array = {1, 6, 7, 5, 9};
                Arrays.sort(array,Collections.reverseOrder());
                System.out.println(Arrays.toString(array));

                Arrays.sort(array);
                System.out.println(Arrays.toString(array));

        }

}
