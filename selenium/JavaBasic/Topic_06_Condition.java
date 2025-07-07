package JavaBasic;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.Scanner;

public class Topic_06_Condition {
    WebDriver driver;
    Scanner scanner = new Scanner(System.in);
    private boolean numberA;

    public static void main(String[]args){
        Topic_06_Condition obj = new Topic_06_Condition();
       // obj.BT_01();
        //obj.BT_02();
        //obj.BT_03();
        //obj.BT_04();
        //obj.BT_05();
        //obj.BT_06();
        obj.BT_07();
    }
@Test
public void BT_01(){
    int number = scanner.nextInt();
    number = number % 2;
    System.out.println(number);
    boolean status = number == 0;
    System.out.println(status);
    if (number % 2 ==0) {
        System.out.println("So: " +number+ " la so chan");
    }else  {
        System.out.println("So: " +number+ " la so le");
    }
}
public void BT_02(){
    int numberA = scanner.nextInt();
    int numberB = scanner.nextInt();
    System.out.println(numberA);
    System.out.println(numberB);
    if (numberA >= numberB){
        System.out.println("So "+numberA+ " lon hon hoac bang so " +numberB);
    }else {
        System.out.println("So "+numberB+ " lon hon " +numberA);
    }
}
public void BT_03(){
        String hoten1= scanner.nextLine();
        String hoten2= scanner.nextLine();
        System.out.println(hoten1);
        System.out.println(hoten2);
    if (hoten1.equals(hoten2)){
        System.out.println("Ten giong nhau");

    }else {
        System.out.println("Ten khac nhau");
    }
}
public void BT_04(){
    int numberA = scanner.nextInt();
    int numberB = scanner.nextInt();
    int numberC = scanner.nextInt();
    if(numberA > numberB && numberA > numberC){
        System.out.println(numberA + " la so lon nhat");
    } else if (numberB > numberC) {
        System.out.println(numberB + " la so lon nhat");
    }else {
        System.out.println(numberC + " la so lon nhat");
    }
}
public void BT_05(){
    int numberA = scanner.nextInt();
    if (numberA > 10 && numberA < 100){
        System.out.println (numberA + " nam trong [10,100]") ;
    }else {
        System.out.println (numberA + " nam ngoai [10,100]");
    }
}
public void BT_06(){
     float numberA = scanner.nextFloat();
     if (numberA> 0 && numberA < 5){
         System.out.println("Diem D");
     } else if (numberA >= 5 && numberA < 7.5) {
         System.out.println("Diem C");
     } else if (numberA >= 7.5 && numberA < 8.5) {
         System.out.println("Diem B");
     } else {
         System.out.println("Diem A");
     }

}
public void BT_07(){
      int month = scanner.nextInt();
      if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
          System.out.println("So ngay cua thang trong nam la 31");
      } else if (month == 2) {
          System.out.println("So ngay cua thang trong nam la 28");
      } else if (month == 4 || month == 6 || month == 9 || month == 11) {
          System.out.println("So ngay cua thang trong nam la 29");
      }
}
}
