package ex_17_StringBuffer_StringBuilder;

public class Lab004_Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("Test");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
