package homework_from_dmitrii_advanced;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdvancedHomework3 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insert 1 number: ");

            int x = scanner.nextInt();

            if (x % 2 != 0) {
                System.out.println("2 " + (x + 2));
            } else {
                System.out.println("0 0");
            }

        } catch (InputMismatchException e) {
            System.out.println("Insert only whole numbers");
        }
    }
}
