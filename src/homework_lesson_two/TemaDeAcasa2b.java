package homework_lesson_two;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TemaDeAcasa2b {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        try {
        System.out.print("Input number 1: ");
        int number1 = myObj.nextInt();

        System.out.print("Input number 2: ");
        int number2 = myObj.nextInt();

        System.out.print("Input number 3: ");
        int number3 = myObj.nextInt();

            if (number1 > number2 && number1 >number3) {
                System.out.println(number1 + " Is the greatest number");
            } else if (number2 > number1 && number2 >number3) {
                System.out.println(number2 + " Is the greatest number");
            } else if (number3 > number1 && number3 >number2){
                System.out.println(number3 + " Is the greatest number");
            } else {
                System.out.println("Please input different numbers");
            }
        } catch (InputMismatchException e) {
            System.out.println("Wrong input. Please input numbers only.");
        }
    }
}


