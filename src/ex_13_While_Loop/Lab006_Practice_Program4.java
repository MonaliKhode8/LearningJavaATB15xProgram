package ex_13_While_Loop;

public class Lab006_Practice_Program4 {
    public static void main(String[] args) {
        int num=6
                ;
        int fact =1;
        int i=1;
        while(i<=num){
            fact=fact*i;
            i++;
        }
        System.out.println(fact);
    }
}
