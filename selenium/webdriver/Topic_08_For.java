package webdriver;

import org.openqa.selenium.WebDriver;

import java.util.Scanner;

public class Topic_08_For {
    WebDriver driver;
    Scanner scanner = new Scanner(System.in);
    public static void main (String[]args){
        Topic_08_For obj= new Topic_08_For();
        //obj.BT_01();
       obj.BT_03();
    }
    public void BT_01(){
        int n = scanner.nextInt();
        for (int i = 0 ; i<=n; i++)
            System.out.println(i);
    }
    public void BT_02(){
        int numberA= scanner.nextInt();
        int numberB= scanner.nextInt();
        for (int i = numberA ; i<=numberB; i++)
        System.out.println(i);
    }
    public void BT_03(){
        int Tong=0;
        for (int i =1; i<=10 ; i++);
        if (i% 2 ==0){
            Tong = Tong+i;
        }
    }
}
