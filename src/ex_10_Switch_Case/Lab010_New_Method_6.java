package ex_10_Switch_Case;

public class Lab010_New_Method_6 {
    public static void main(String[] args){
        // in JDK 13 ---new syntax break included
        int itemcode = 005;
        switch (itemcode){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            case 004 -> System.out.println("004");
            case 005 -> System.out.println("005");
            default -> System.out.println("Default");
        }
    }
}
