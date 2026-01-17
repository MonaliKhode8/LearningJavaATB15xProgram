package ex_16_String;

public class Lab003_String_Immutable1 {
    public static void main(String[] args) {
        String s1 = "Hello";
        s1 = s1.concat("World");
        System.out.println(s1);
    }
}
