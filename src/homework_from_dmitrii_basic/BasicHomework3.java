package homework_from_dmitrii_basic;

import java.util.Scanner;

public class BasicHomework3 {
    public static void main(String[] args) {
//        Write a Java program to check whether a given number is even or odd.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}

//OR
//System.out.println(number % 2 == 0 ? "Even" : "Odd");
