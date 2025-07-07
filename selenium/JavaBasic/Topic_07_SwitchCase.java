package JavaBasic;

import org.openqa.selenium.WebDriver;

import java.util.Scanner;

public class Topic_07_SwitchCase {
    WebDriver driver;
    Scanner scanner = new Scanner(System.in);
   public static void main (String[]args){
       Topic_07_SwitchCase obj= new Topic_07_SwitchCase();
       //obj.BT_01();
       obj.BT_02();
   }
    public void BT_01(){
        int month = scanner.nextInt();
        switch (month){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;
        }
    }
    public void BT_02(){

       int firstNum = scanner.nextInt();
       int secondNum =  scanner.nextInt();
        String operator = scanner.next();

       switch (operator){
           case " + ":
               System.out.println("A + B = " + (firstNum + secondNum));
               break;
           case " - ":
               System.out.println("A - B = " + (firstNum - secondNum));
               break;
           case " * ":
               System.out.println("A x B = " + (firstNum * secondNum));
               break;
           case " / ":
               System.out.println("A / B = " + (firstNum / secondNum));
               break;
       }
    }
}
