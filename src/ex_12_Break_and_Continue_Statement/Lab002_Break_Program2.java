package ex_12_Break_and_Continue_Statement;

public class Lab002_Break_Program2 {
    public static void main(String[] args) {
        for(int i=0;i<50;i++){

            if(i==5){
                break;
            }
            System.out.println(i);
        }
        System.out.println("End of the program");
    }
}
