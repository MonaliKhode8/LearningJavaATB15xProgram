package ex_17_StringBuffer_StringBuilder;

public class Lab002_Srtingbuilder_vs_StringBuffer {
    public static void main(String[] args) {
        String s1 = "Monali";
        String s2 = new String("Monali");

        StringBuffer stringBuffer = new StringBuffer("Monali");
        StringBuilder stringBuilder = new StringBuilder("Monali");

        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());

    }
}
