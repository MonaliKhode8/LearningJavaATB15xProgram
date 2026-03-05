package ex_18_Arrays;

public class Lab011_2nd_Highest_Num_Array {
    public static void main(String[] args) {
        int numbers[] = {10,20,56,76,10,16};
        int Highest = 0;
        int SecondHighest = 0;

        for(int num: numbers){
            if(num>Highest){
                SecondHighest=Highest;
                Highest=num;
            }

        }
        System.out.println(SecondHighest);
    }
}
