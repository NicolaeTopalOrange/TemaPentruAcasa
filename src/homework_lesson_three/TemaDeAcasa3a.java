package homework_lesson_three;

import java.util.Scanner;

public class TemaDeAcasa3a {
    public static void main(String[] args) {
//        Write a program to read gender(M/F) and print the corresponding gender using a switch statement
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'M' for Male or 'F' for Female");
        String input = scanner.nextLine();
        char gender = input.charAt(0);
        switch (gender) {
            case 'M':
            case 'm':
                System.out.println("Male");
                break;
            case 'F':
            case 'f':
                System.out.println("Female");
                break;
            default:
                System.out.println("Incorrect Gender");


        }

    }
}
