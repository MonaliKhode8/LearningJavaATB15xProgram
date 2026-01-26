package ex_18_Arrays;

public class Lab001_Array_Program1 {
    public static void main(String[] args) {
        int marks[] = {97,95,88,87,86,91};
        int[] marks1 = {90,92,84,86,86,93};
        boolean Is_Married[] = {true, false, true};
        String Name[] = {"Monali","Arun","Khode"};
        String[] Name1 = {"Monali1","Arun1","Khode1"};
        float value1[] = {0.31f, 21.03f,45.06f};
//or
        float[] values = new float[3];
        values[0]=3.14f;
        values[1]=3.15f;
        values[2]=3.16f;

        for(String item :Name){
            System.out.println(item);
        }
    }
}
