package exercitii;

public class LessonSeven {
    public static void main(String[] args) {
//        metoda statica poti sa o initializezi fara a crea obiect
        checkBalanceOfCustomer(789996498, 225.6);
    }
    static void checkBalanceOfCustomer(int idnp, double balance) {
        if (balance>0) {
            System.out.println("Acceptam creditare pentru " + idnp);
        } else {
            System.out.println("Refuz creditare pentru " + idnp);
        }

    }




}
