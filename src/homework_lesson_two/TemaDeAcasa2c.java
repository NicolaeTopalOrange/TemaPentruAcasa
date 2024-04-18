package homework_lesson_two;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TemaDeAcasa2c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Input a year of 4 numbers: ");
            int year = scanner.nextInt();

            boolean isLeapYear = false;

            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    isLeapYear = year % 400 == 0;
                } else {
                    isLeapYear = true;
                }
            }

            if (isLeapYear) {
                System.out.println(year + " este un an bisect.");
            } else {
                System.out.println(year + " nu este un an bisect.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Wrong input. Please input a 4 number composed year.");

        }
    }
}

