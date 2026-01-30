package ex_18_Arrays;

public class Lab009_Sum_of_an_Array {
    public static void main(String[] args) {

        int[] numbers = {11,22,33};
        int sum =0;
        for(int i=0;i<numbers.length;i++){
           sum = sum+numbers[i];
        }
        System.out.println(sum);
    }
}
