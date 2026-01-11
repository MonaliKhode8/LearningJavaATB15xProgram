package ex_10_Switch_Case;

public class Lab013_Is_this_a_Valid_Syntax7 {
    public static void main(String[] args){
        // Output --- it prints Helloooooo!!!!!!!! and 65 because break is not there.
        char code='C';
        switch(code){
            default:
                System.out.println("Helloooooo!!!!!!!!");
            case 'A':
                System.out.println("65");
                break;
            case 'B':
                System.out.println("66");
                break;
        }
    }
}

