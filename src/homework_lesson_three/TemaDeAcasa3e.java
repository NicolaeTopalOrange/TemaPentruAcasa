package homework_lesson_three;

import java.util.Scanner;

public class TemaDeAcasa3e {
    public static void main(String[] args) {
//        Write a program where the user enters any positive integer.
//        The program then calculates the sum of all numbers from 1 to the number entered by the user
//        For example: if the user enters the number 3.
//        The program should calculate the sum of numbers from 1 to 3, which is 1+2+3, and output the answer 6.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
            return;
        }

        int factorial = 0;
        int i = 0;

        while (i <= n) {
            factorial += i;
            i++;
        }

        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}
