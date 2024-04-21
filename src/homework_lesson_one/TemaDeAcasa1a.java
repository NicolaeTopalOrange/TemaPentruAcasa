package homework_lesson_one;

import java.util.Scanner;

public class TemaDeAcasa1a {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Insert number");

        int squareNumber = myObj.nextInt();
        System.out.println("Square Number is: " + squareNumber*squareNumber);
    }
}
