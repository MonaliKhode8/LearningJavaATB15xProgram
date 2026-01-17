package ex_16_String;

public class Lab007_String_Program4 {
    public static void main(String[] args) {
        String s = "Java";
        char c = s.charAt(2);  // it is index always starts with 0
        System.out.println(c);

        int result1 = "abc".compareTo("ABC");
        System.out.println(result1);

        int result2 = "XYZ".compareTo("xyz");
        System.out.println(result2);

        int result3 = "XYZ".compareTo("XYZ");
        System.out.println(result3);

        // indexOf function, lastIndexOf, isEmpty, join, replace, starts with, concat

        int idx = "Java".indexOf("v");
        System.out.println(idx);

        int idx1 = "Java".lastIndexOf("a");
        System.out.println(idx1);

        boolean b = "".isEmpty();
        System.out.println(b);

        boolean b11 = "test".isEmpty();
        System.out.println(b11);

        String j1 = String.join("*","Java","Python");
        System.out.println(j1);

        String j2 = String.join("-","Java","Python");
        System.out.println(j2);

        String j3 = "Java".replace('a', 'o');
        System.out.println(j3);

        boolean t1 = "java".startsWith("Ja");
        System.out.println(t1);

        boolean t2 = "Java".startsWith("Ja");
        System.out.println(t2);

        String t3 = "java".concat("Mava");
        System.out.println(t3);

    }
}
