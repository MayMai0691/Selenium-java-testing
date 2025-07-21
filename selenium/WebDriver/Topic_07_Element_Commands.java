package WebDriver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_07_Element_Commands {
    WebDriver driver;
    @BeforeClass
    public void beforeClass(){
        driver = new ChromeDriver();
        driver.get("https://live.techpanda.org/index.php/customer/account/login/");

    }
    @Test
    public void TC_01(){
        //Click vao element
        driver.findElement(By.cssSelector("")).click();

        //Element cho phep edit
        driver.findElement(By.cssSelector("")).clear();
        driver.findElement(By.cssSelector("")).sendKeys();

        //Kiem tra element laf enable hay disable
        Assert.assertTrue(driver.findElement(By.cssSelector("")).isEnabled());
        Assert.assertFalse(driver.findElement(By.cssSelector("")).isEnabled());

        //Kiểm tra element la hien thi hay k
        Assert.assertTrue(driver.findElement(By.cssSelector("")).isDisplayed());
        Assert.assertFalse(driver.findElement(By.cssSelector("")).isDisplayed());

        //Kiểm tra element được chọn hay chưa
        Assert.assertTrue(driver.findElement(By.cssSelector("")).isSelected());
        Assert.assertFalse(driver.findElement(By.cssSelector("")).isDisplayed());

        //Lay du lieu dang text
        driver.findElement(By.cssSelector("")).getText();
        Assert.assertEquals(driver.findElement(By.cssSelector("")).getText("");

         //Lay ra gia tri thuoc tinh DOM
        Assert.assertEquals(driver.findElement(By.cssSelector("")).getDomProperty(""));

         // Lay ra chieu cao chieu rong
        //driver.findElement(By.cssSelector("")).getSize().getHeight();
       // driver.findElement(By.cssSelector("")).getSize().getWidth();
        Dimension loginButtonSize = driver.findElement(By.cssSelector("")).getSize();
            loginButtonSize.getHeight();
            loginButtonSize.getWidth();

        // Lay ra vi tri cua element so voi button login
        Point loginButtonLocation = driver.findElement(By.cssSelector("")).getLocation();
        loginButtonLocation.getX();
        loginButtonLocation.getY();

        //Lay ra the HTML cuar element
        driver.findElement(By.cssSelector("")).getTagName();

        //Shadow DOM
        driver.findElement(By.cssSelector("")).getShadowRoot();

        //Chi ap dung cho element trong form
        driver.findElement(By.cssSelector("")).submit();

    }
    @AfterClass
    public void afterClass(){
        driver.quit();
}
}
