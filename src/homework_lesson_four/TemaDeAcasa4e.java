package homework_lesson_four;

import java.util.Arrays;

public class TemaDeAcasa4e {
    public static void main(String[] args) {
// Write a Java program to search for a specific element in an array and return its index.
        int[] array = {1, 6, 7, 5, 9};
        int searchedItem = 6;
        int point = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchedItem) {
                point = i;
                break;
            }
        }

        if (point != -1) {
            System.out.println("Elementul " + searchedItem + " a fost găsit la indexul: " + point);
        } else {
            System.out.println("Elementul " + searchedItem + " nu a fost găsit în array.");
        }
    }
}
