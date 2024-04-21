package homework_lesson_three;

import java.util.Scanner;

public class TeamDeAcasa3c {
    public static void main(String[] args) {
//        Write a program to find the Maximum of Two Numbers using switch statement
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        int max;

//        If num1 is greater than num2, we set the switch expression to 1.
//        If num1 is less than num2, we set the switch expression to -1.
//        If both numbers are equal, we set the switch expression to 0.
        switch (num1 > num2 ? 1 : num1 < num2 ? -1 : 0) {
            case 1:
                max = num1;
                break;
            case -1:
                max = num2;
                break;
            default:
                System.out.println("Both numbers are equal.");
                return;
        }

        System.out.println("Maximum of " + num1 + " and " + num2 + " is: " + max);

        input.close();
    }
}

