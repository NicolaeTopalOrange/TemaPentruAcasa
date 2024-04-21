package homework_lesson_one;

import java.util.Scanner;

public class TemaDeAcasa1c {
    public static void main(String[] args) {
        Scanner myObjOne = new Scanner(System.in);
        System.out.println("Insert a number");

        int numberOne = myObjOne.nextInt();
        int squareSides = 4;
        int perimeter =  numberOne * squareSides;
        int area = numberOne * numberOne;
        System.out.println("Perimeter:" + perimeter + "\n" +"Area: " + area);
    }
}
