package ex_15_Functions;

public class Lab005_user_defined_functionP {
    public static void main(String[] args) {

        // User defined functions are of 4 types:
        //1. Without Parameter and without return type
        //2. Without parameters but with return type
        //3. With parameter and without return type
        //4. With parameter and with return type

        //1. Without Parameter and without return type
        wop_wor_greet();
        //2. Without parameters but with return type
        String msg = wop_wr_greet_2();
        //3. With parameter and without return type
        greet_with_details("Monali",65,100);
        //4. With parameter and with return type
        int sum = sum_of_two_numbers(3,4);


    }

     static int sum_of_two_numbers(int i, int i1) {
        return i+i1;

    }

     static void greet_with_details(String monali, int i, int i1) {
    }

     static String wop_wr_greet_2() {
        return "Monali";

    }

    static void wop_wor_greet(){

    }
}
