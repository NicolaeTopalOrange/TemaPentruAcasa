package homework_lesson_four;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class TemaDeAcasa4c {
    public static void main(String[] args) {
//        Write a Java program to find the intersection of two arrays (common elements).
        int[] arrayOne = {1, 6, 7, 5, 9};
        int[] arrayTwo = {6, 8, 1, 84, 5};
        List<Integer> elementsCom = new ArrayList<>();

        for (int number : arrayOne) {
            for (int number2 : arrayTwo) {
                if ( number == number2){
                    elementsCom.add(number);
                    break;
                }
            }
        }
        System.out.println("Elementele comune sunt: " + elementsCom);
    }
}
