package ex_06_Java_Operator_Incre_Decre;

public class Lab013_ex13_Task {
    public static void main(String[] args) {

        int a = 10;
        a = a++ + a++ + a++;
        System.out.println(a);   //10+11+12

        int a1 = 3;
        int b = a1++ * ++a1;     // a1++ =3
        System.out.println(b);  // 3 * 5

        int x = 5;                       // 5
        System.out.println(x++ + x--);  // 5+6 = 11


    }
}
