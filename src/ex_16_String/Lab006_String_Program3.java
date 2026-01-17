package ex_16_String;

public class Lab006_String_Program3 {
    public static void main(String[] args) {
        String s1 = "HELLO";
        String s2 = new String("world");

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println(str1==str2);   // true - same value
        System.out.println(str1==str3);   // false - value is same but location is new(location is different for both)
        System.out.println(str1.equals(str3));   // true - value is same


    }
}
