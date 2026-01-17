package ex_17_StringBuffer_StringBuilder;

public class Lab001_Srtingbuilder {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Sonal");
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.toString());

    }
}
