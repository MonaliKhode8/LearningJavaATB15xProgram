package ex_16_String;

public class Lab001_String_Immutable {
    public static void main(String[] args) {
        String name ="Monali";
        boolean result = name.contains("n");
        System.out.println(result);
        // Strings are immutable in nature (immutable - if we create any string
        // that will not be deleted it will be present in the String Constant Pool)
        name.toUpperCase();
        System.out.println(name);
        System.out.println("---------");
        String Name1 = name.toUpperCase();
        System.out.println(Name1);





    }
}
