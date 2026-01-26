package ex_18_Arrays;

public class LAb008_Array_Reverse {
    public static void main(String[] args) {

        int[] numbers = {10,21,15,97,26};

        for(int i=numbers.length-1;i>=0;i--)
        {
            System.out.println(numbers[i]);
        }
    }
}
