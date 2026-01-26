package ex_18_Arrays;

import java.util.Arrays;

public class Lab007_Array_Sort {
    public static void main(String[] args) {
        int[] marks = {1,8,7,6,3,10,9};
        Arrays.sort(marks);
        System.out.println(marks[marks.length-1]);
    }
}
