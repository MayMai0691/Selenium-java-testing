package webdriver;

import org.openqa.selenium.WebDriver;

import java.util.Scanner;

public class Topic_09_WhileDoWhile {
    WebDriver driver;
    static Scanner scanner = new Scanner(System.in);
    public static void main (String[]args) {
        Topic_09_WhileDoWhile obj = new Topic_09_WhileDoWhile();
        obj.BT_06();
    }
    public static void BT_01() {
        int number = scanner.nextInt();
        for (int i = number; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    public void BT_02(){
         int number= scanner.nextInt();
         while (number < 100){
             if (number % 2 == 0){
                 System.out.println(number);

             } number++;
         }
        }
     public void BT_03(){
        int numberA= scanner.nextInt();
        int numberB= scanner.nextInt();
        while (numberA < numberB){
            if(numberA % 3 ==0 && numberA % 5 ==0){
                System.out.println(numberA);
            } numberA++;
        }
     }
    public void BT_04() {
        int numberA = scanner.nextInt();
        int i = 0;
        while (numberA > 0) {
            if (numberA % 2 != 0) {
                System.out.println(numberA);
                i += numberA;
            }
            numberA--;
        }
                System.out.println(i);
            }
    public void BT_06() {
        int numberA = scanner.nextInt();
        int i = 1;
        while (numberA > 0) {
            System.out.println(numberA);
            i *= numberA;
            numberA--;
    }
        System.out.println(i);
    }
    }

