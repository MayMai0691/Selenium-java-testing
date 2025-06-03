package webdriver;

import org.testng.annotations.Test;

public class Topic_04_Operator {

    @Test
    public void swapNumber(){
        int a = 5;
        int b = 6;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
    @Test
    public  void comapreNumber() {
        int a = 5;
        int b = 4;
        boolean value;
        value = (a>b) ?true : false;
            System.out.println("value");
    }
    @Test
    public void nameAge(){
        String name ="Tuan";
        int age=27;
        System.out.println("After 15 years,age of" + name + " will be" + (age+15));
    }
}
