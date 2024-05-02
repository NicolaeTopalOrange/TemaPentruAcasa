package exercitii;

public class ExercitiiLessonFive {
    public static void main(String[] args) {
        MetodaStatica.verifyIfOdd(3, 6);
    }

    public static class MetodaStatica {
        static void verifyIfOdd(int number1, int number2) {
            if (number1 % 2 != 0 || number2 % 2 != 0) {
                System.out.println("Cel putin un numar este impar");
            } else {
                System.out.println("Toate numerele sunt pare");
            }
        }
    }
}

