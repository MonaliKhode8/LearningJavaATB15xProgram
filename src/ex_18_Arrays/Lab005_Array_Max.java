package ex_18_Arrays;

import java.util.Arrays;

public class Lab005_Array_Max {
    public static void main(String[] args) {

        int[] marks = {10,20,30,40,50};

        int max = marks[0];
        for(int i=0;i<marks.length;i++){
            max=marks[i];
        }
        System.out.println(max);
    }
}
