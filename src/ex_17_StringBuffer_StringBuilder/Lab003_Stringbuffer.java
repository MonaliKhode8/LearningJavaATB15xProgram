package ex_17_StringBuffer_StringBuilder;

public class Lab003_Stringbuffer {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Monali");
        stringBuffer.append("Khode");
        System.out.println(stringBuffer);

        String s1 = "Monali";
        s1 = s1 + "Khode";
        System.out.println(s1);

    }
}
