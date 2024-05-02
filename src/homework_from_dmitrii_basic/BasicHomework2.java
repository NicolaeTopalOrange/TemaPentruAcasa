package homework_from_dmitrii_basic;

import java.util.Scanner;

public class BasicHomework2 {
    public static void main(String[] args) {
//        Temperature converter.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert temperature in Celsius: ");
        System.out.println("Temperature converted to Fahrenheit: " + (scanner.nextDouble()*1.9+32));
        scanner.close();
    }
}
