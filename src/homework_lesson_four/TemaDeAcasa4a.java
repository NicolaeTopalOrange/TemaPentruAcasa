package homework_lesson_four;

import java.util.Arrays;
import java.util.Collections;

public class TemaDeAcasa4a {
    public static void main(String[] args) {
//        Write a Java program to reverse an array of integers.
        Integer[] originalArray = {1, 2, 3, 4, 5};
        Collections.reverse(Arrays.asList(originalArray));
        System.out.println(Arrays.toString(originalArray));

    }
}
