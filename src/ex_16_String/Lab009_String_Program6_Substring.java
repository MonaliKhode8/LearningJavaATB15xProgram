package ex_16_String;

public class Lab009_String_Program6_Substring {
    public static void main(String[] args) {
        String s = "Java".substring(2);
        System.out.println(s);

//        String s1 = "Mava".substring(5);
//        System.out.println(s1);

        // "unhappy".substring(2) returns "happy"
        // "Harbison".substring(3) returns "bison".
        // "Emptiness".substring(9) returns "" (empty string).

        boolean b1 = "".isBlank();
        System.out.println(b1);

        String str = "ab".repeat(5);
        System.out.println(str);

        long count1 = "a\nb\nc".lines().count();
        System.out.println(count1);

        String tt = "        Sonal HArish";        //  trim removes space
        System.out.println(tt.trim());
    }
}
