package ex_05_Java_Operator;

public class Lab002_Student_Marks_Pass_Fail {

    public static void main(String[] args) {

        int marks = 100;
        String StudRes = (marks>=40)? "Pass": "Fail";
        System.out.println(StudRes);
    }
}
