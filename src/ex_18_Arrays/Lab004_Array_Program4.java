package ex_18_Arrays;

public class Lab004_Array_Program4 {
    public static void main(String[] args) {

        int[] marks = {10,20,30,40,50};
        System.out.println("Marks length is: "+ marks.length);

         for(int item:marks)
         {
             System.out.println(item);
         }
        System.out.println("==================");

         for(int i =0; i<marks.length;i++)
         {
             System.out.println(marks[i]);
         }
    }
}
