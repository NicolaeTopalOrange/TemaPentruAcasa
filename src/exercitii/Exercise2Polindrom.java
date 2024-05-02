package exercitii;

public class Exercise2Polindrom {
    public static void main(String[] args) {
       palindrom("level");
    }
    static void palindrom(String str){
        StringBuffer text1= new StringBuffer(str);
//        facem cu to string deoarece text 1 e obiect stringbuffer dar str e primitiva
        text1 =text1.reverse();
        if (text1.toString().equals(str)) {
            System.out.println("E Palindrom");
        }else {
            System.out.println("Nu e Palindrom");
        }
    }
}
