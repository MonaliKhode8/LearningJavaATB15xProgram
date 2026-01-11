package ex_10_Switch_Case;

import java.util.Scanner;

public class Lab004_Real_Automation_Switch {
    public static void main(String[] args){
        // Web automation
        //I will ask the user to give me the input from browser which he wants to be use.
        // I will strat the automation in that browser.
        System.out.println("Enter the browser name");
        Scanner sc = new Scanner(System.in);
        String browser = sc.next();
        browser = browser.toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("You are using a chrome browser");
                break;
            case "safari":
                System.out.println("You are using a Safari browser");
                break;
            case "firefox":
                System.out.println("You are using a Firefox browser");
                break;
            case "mozilla":
                System.out.println("You are using a Mozilla browser");
                break;
            default:
                System.out.println("I have no idea which browser is this");
        }
    }
}
