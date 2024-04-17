package exercitii;

import java.sql.SQLOutput;

public class ExercitiiLessonTwo {
    public static void main(String[] args) {

// Din string transformam in int
        /*String nr = "5";
        System.out.println(nr+5);
        int a = Integer.parseInt(nr);
        System.out.println(a+5);*/

// Data casting from double to int
        /*double nr = 1.00;
        int x = (int) nr;
        System.out.println(x);*/
//        System.out.println(Math.pow(5,2));

        /*System.out.println(5>5);*/

        String position = "Developer";
        long automationSalary = 1L;
        long manualSalary = 2L;
        long developerSalary = 3L;

        if (position.equals("Automation Tester")) {
            System.out.println("Rise for automation");
            System.out.println(automationSalary *= 2);
        } else if (position.equals("Manual Tester")) {
            System.out.println("Rise for Manual");
            System.out.println(manualSalary *= 2);
        } else if (position.equals("Developer")) {
            System.out.println("Rise for Developer");
            System.out.println(developerSalary += 1);
        }
            }

        }


