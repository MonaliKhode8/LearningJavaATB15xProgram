package ex_05_Java_Operator;

public class Lab001_Max_Of_Three_Ternary_Operator {

    public static void main(String[] args){

        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

        String Max = (n1>=n2 && n1>=n3)?"n1 is big":
                     (n2>=n3 && n2>=n1)?"n2 is big":"n3 is big";

        System.out.println(Max);



    }

}
