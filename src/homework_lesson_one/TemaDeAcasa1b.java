package homework_lesson_one;

import java.util.Scanner;

public class TemaDeAcasa1b {
    public static void main(String[] args) {
        Scanner myObjOne = new Scanner(System.in);
        Scanner myObjTwo = new Scanner(System.in);
        System.out.println("Insert 2 numbers");

        int numberOne = myObjOne.nextInt();
        int numberTwo= myObjTwo.nextInt();
        int sum =  numberOne + numberTwo;
        int product = numberOne * numberTwo;
        System.out.println("Sum:" + sum + "\n" +"Product: " + product);

    }
}
