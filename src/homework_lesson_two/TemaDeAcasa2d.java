package homework_lesson_two;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TemaDeAcasa2d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert 5 numbers.");
        try {
            double sum = 0;

            for (int i = 1; i <= 5; i++) {
                System.out.print("Number " + i + ": ");
                double number = scanner.nextDouble();
                sum += number;
            }
            double average = sum / 5;

            System.out.println("Sum of these numbers is: " + sum);
            System.out.println("Average of these numbers is: " + average);
        } catch (InputMismatchException e) {
            System.out.println("Wrong input. Please input number only.");

        }

    }
}


