package homework_lesson_two;

import java.util.Scanner;

public class TemaDeAcasa2a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");

        try {
            int input = in.nextInt();
            if (input > 0) {
                System.out.println("Number is positive");
            } else if (input < 0) {
                System.out.println("Number is negative");
            } else {
                System.out.println("Number is zero");
            }
        } catch (Exception e) {
            System.out.println("Wrong input. Please input a number.");
        }
    }
}
