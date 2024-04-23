package homework_lesson_four;

public class TemaDeAcasa4d {
    public static void main(String[] args) {
//        Write a Java program to calculate the average of all elements in an integer array.
        double[] array = {1, 6, 7, 5, 9};
        int lenght = array.length;
        double sum = 0;
        for (int i = 0; i < lenght; i++) {
            sum += array[i];
        }
        double average = sum / lenght;
        System.out.println("Array average is: " + average);

    }
}
