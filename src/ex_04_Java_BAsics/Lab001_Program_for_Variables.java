package ex_04_Java_BAsics;

public class Lab001_Program_for_Variables {
    public static void main(String[] args){
        // Example1
        int test = 25;
        System.out.println(test);

        // Example2
        int a1 = 10;
        int a2 = -10;
        a1 = 65+1;
        System.out.println(a1);

        // Example3 - age of a person
        byte age = 75;
        //byte age = 175;            -----byte store character up to 127 only and age is up to 122 so we can use byte
        System.out.println(age);

        // Example4      --------variable name with _
        int count_ = 15;
        System.out.println(count_);
        int count$ = 17;
        System.out.println(count$);

        // Example5               --------Long variable name
        int This_is_a_very_Long_Variable_NAme_USing_in_the_Program=899;

        // Example6   ------What will be the output
        int _123 = 123;
        System.out.println(_123);

        // Example7 ------ Reserve word  ---- enum is reserved keyword
        /*
        int enum =10;
        System.out.println(enum);
        int Enum =10;
        System.out.println(Enum);
        */

        //Example8 ------IS this a VAlid syntax
        int Monali$Khode=28;
        int Lab003_interview_QnA = 18;

        //Example9
        boolean Pramod_has_a_Audi=false;
        boolean Is_she_drives_a_car = true;
        //Example10


    }
}
