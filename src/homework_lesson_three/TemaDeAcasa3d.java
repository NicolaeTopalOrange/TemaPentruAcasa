package homework_lesson_three;

import java.util.Scanner;

public class TemaDeAcasa3d {
    public static void main(String[] args) {
//        Write a Java program that calculates the factorial of a given non-negative integer using a while loop.
//       The factorial of a non-negative integer n, denoted by n!, is the product of all positive
//        integers less than or equal to n.
//        For input n = 5, the factorial is calculated as 5! = 5 * 4 * 3 * 2 * 1 = 120.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
            return;
        }

        int factorial = 1;
        int i = 1;

        while (i <= n) {
            factorial *= i;
            i++;
        }

        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}
