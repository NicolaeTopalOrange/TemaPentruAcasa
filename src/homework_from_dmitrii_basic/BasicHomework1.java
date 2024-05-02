package homework_from_dmitrii_basic;

import java.util.Scanner;

public class BasicHomework1 {
    public static void main(String[] args) {
//        Two integers are given. How many times can the second number be subtracted from the first number?
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert 2 integers: ");
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        System.out.println("Number one is divided by Number two " + numberOne/numberTwo + " times.");
        scanner.close();


    }
}
