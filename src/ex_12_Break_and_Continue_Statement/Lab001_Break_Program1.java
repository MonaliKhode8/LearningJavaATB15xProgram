package ex_12_Break_and_Continue_Statement;

public class Lab001_Break_Program1 {
    public static void main(String[] args) {

        for(int i=0;i<50;i++){
            System.out.println(i);
            if (i==5){
             break;
            }
        }
        System.out.println("End of the program");
    }
}
