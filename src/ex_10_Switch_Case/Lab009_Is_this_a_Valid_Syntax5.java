package ex_10_Switch_Case;

public class Lab009_Is_this_a_Valid_Syntax5 {
    public static void main(String[]args){
        // duplicate case not allowed in switch
        int a =98;
        switch(a){
           case 98:
            System.out.println("98");
           // case 98:
                System.out.println("98");
        }
    }
}
