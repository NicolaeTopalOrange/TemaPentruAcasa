package temapeacasa1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TemaDeAcasa1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Insert number");

        int squareNumber = myObj.nextInt();
        System.out.println("Square Number is: " + squareNumber*squareNumber);
    }
}
