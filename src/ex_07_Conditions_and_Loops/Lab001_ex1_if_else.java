package ex_07_Conditions_and_Loops;

public class Lab001_ex1_if_else {
    public static void main(String[] args) {

        System.out.println("Enter the age via CLI options\n");
        int age = Integer.parseInt(args[0]);

        if(age>18){
            System.out.println("You can Vote");
        }else
        {
            System.out.println("You can't Vote");
        }

    }
}
