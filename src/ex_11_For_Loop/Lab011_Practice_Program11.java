package ex_11_For_Loop;

public class Lab011_Practice_Program11 {
    public static void main(String[] args) {

        // output will be same for both i++ and ++i

        for(int i=0;i<10;i++) {
            System.out.println(i);
        }
        System.out.println("-----------------------------------");

            for(int i=0;i<10;++i){
                System.out.println(i);
        }
    }
}
