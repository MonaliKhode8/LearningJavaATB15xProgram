package ex_10_Switch_Case;

public class Lab011_New_Method_7 {
    public static void main(String[] args){
        // Multiple conditions with the same output
        int itemcode=007;
        switch (itemcode){
            case 001,002,006:
                System.out.println("All are electronic gadgets");
                break;
            case 003,004,007:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("This is Default");
        }
    }
}
