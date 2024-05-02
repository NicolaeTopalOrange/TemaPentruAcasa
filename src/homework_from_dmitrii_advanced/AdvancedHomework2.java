package homework_from_dmitrii_advanced;

import java.util.Scanner;

public class AdvancedHomework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumber;

        System.out.print("Enter the number (M): ");
        int m = scanner.nextInt();

        System.out.print("Enter the number (N): ");
        int n = scanner.nextInt();

        if (m>n) {
          maxNumber = m;
        } else {
            maxNumber = n;
        }

        if (maxNumber % 2 == 0){
            System.out.println("The result is: " + (maxNumber+2));
        } else
            System.out.println("The result is: " + ++maxNumber);

        scanner.close();

    }
}

