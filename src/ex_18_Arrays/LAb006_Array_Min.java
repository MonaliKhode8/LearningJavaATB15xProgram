package ex_18_Arrays;

public class LAb006_Array_Min {
    public static void main(String[] args) {

        int[] marks = {9,10,20,7,30,40,50};
        int min = marks[0];
        for(int i=0;i<marks.length;i++){

           if(marks[i]<min)
            min=marks[i];
        }
        System.out.println(min);
    }
}
