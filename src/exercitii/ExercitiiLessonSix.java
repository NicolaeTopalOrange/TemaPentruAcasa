package exercitii;

public class ExercitiiLessonSix {
//    Factorial
public static void main(String[] args) {
    ExercitiiLessonSix exerciseFactorial = new ExercitiiLessonSix();
    exerciseFactorial.findFactorial(6);
}

void findFactorial(int number){

    int factorial = 1;
    for (int i = 1; i<=number; i++) {
        factorial*=i;
    }
    System.out.println("Factorial "+ factorial);
}

}
