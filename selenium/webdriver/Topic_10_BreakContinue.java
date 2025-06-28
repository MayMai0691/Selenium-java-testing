package webdriver;

import org.openqa.selenium.WebDriver;

import java.util.Scanner;

public class Topic_10_BreakContinue {
    WebDriver driver;
    static Scanner scanner = new Scanner(System.in);
    public static void main (String[]args) {
        Topic_09_WhileDoWhile obj = new Topic_09_WhileDoWhile();
        obj.BT_06();
    }
    public static void BT_01() {
        for (int i=1 ; i<=5; i++){
            System.out.println("i = "+i);
        }

    }
}
