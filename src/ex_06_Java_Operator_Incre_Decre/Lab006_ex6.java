package ex_06_Java_Operator_Incre_Decre;

public class Lab006_ex6 {
    public static void main(String[] Args){
        int a =10;
        System.out.println(a++ + ++a);
        System.out.println(a);

        // Line No | a | Exp(Print)
        // A--> a++
        // B--> ++a
        //       5 | 10 | na
        //       6 | 10 | 10+12
    }
}
