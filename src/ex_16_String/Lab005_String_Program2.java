package ex_16_String;

public class Lab005_String_Program2 {
    public static void main(String[] args) {
        // it will pointing old if the string is same
        String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 = "HELLO";
        String s5 = "Hello";

// it will create new always new area id does not matter the String is same still it create new
        String s4 = new String("Hello");
        String s6 = new String("HELLO");
        String s7 = new String("hello");
        String s8 = new String("hello");

// comparison == - String checks the reference in the String
        System.out.println(s5==s4);
        System.out.println(s2==s6);
        System.out.println(s7==s8);
        System.out.println(s1==s2);

        // equals checks the (content) value

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s5));
        System.out.println(s7.equals(s8));
        System.out.println(s4.equals(s5));
        System.out.println(s7.equals(s6));
        System.out.println(s7.equalsIgnoreCase(s6));

    }
}
