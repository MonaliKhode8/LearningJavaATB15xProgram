package ex_12_Break_and_Continue_Statement;

public class Lab004_For_Loop_Continue_Even_Numbers {
    public static void main(String[] args) {
        for(int i=0; i<=50;i++){
            if(i%2!=0){
                continue;
            }
            System.out.println(i);
        }
    }
}
