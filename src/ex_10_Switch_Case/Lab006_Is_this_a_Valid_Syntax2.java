package ex_10_Switch_Case;

public class Lab006_Is_this_a_Valid_Syntax2 {
    public static void main(String[] args) {
        char ch ='A';
        switch(ch){
            // ch will match int value
            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No Match");
        }
    }
}
