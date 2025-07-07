package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_03_Locator {
    WebDriver driver;
    @BeforeClass
    public void beforeClass() {
        //Khoi tao trinhh duyet
        driver = new ChromeDriver();
        //Mo trinh duyet
        driver.get("https://live.techpanda.org/index.php/customer/account/login/");
    }
    @Test
    public void TC_01_ID() {
        driver.findElement(By.id("email"));
        driver.findElement(By.id("search"));
    }

    @Test
    public void TC_02_Class() {
        //Class chi truyen vao 1 phan neu co khoang trang
        driver.findElement(By.className("validate-email"));
        driver.findElement(By.className("validate-password"));
    }

    @Test
    public void TC_03_Name() {
        driver.findElement(By.name("login[username]"));
        driver.findElement(By.name("login[password]"));
        driver.findElement(By.name("email"));
    }
    public void TC_04_TagName() {
        //Tim co bn the html giong nhau
       int inputNumber= driver.findElements(By.tagName("input")).size();
       System.out.println(inputNumber);
    }
    public void TC_05_LinkText() {
        driver.findElement(By.linkText("MY ACCOUNT"));
        driver.findElement(By.linkText("ORDERS AND RETURNS"));
        driver.findElement(By.linkText("CUSTOMER SERVICE"));

    }
    public void TC_06_PartialLinkText() {
        driver.findElement(By.partialLinkText("ACCOUNT"));
        driver.findElement(By.partialLinkText("ORDERS"));
        driver.findElement(By.partialLinkText("CUSTOMER"));

    }
    public void TC_07_Css() {
        //css voi ID
        driver.findElement(By.cssSelector("input[id='email']"));
        driver.findElement(By.cssSelector("#email"));
        driver.findElement(By.cssSelector("input#email"));
        //css voi class
        driver.findElement(By.cssSelector("div[class=account-login']"));
        driver.findElement(By.cssSelector(".account-login"));
        driver.findElement(By.cssSelector("div.account-login"));
        driver.findElements(By.cssSelector(".registered-users"));
        driver.findElements(By.cssSelector("div.registered-users"));
        //css voi Name
        driver.findElement(By.cssSelector("input[name='login[username]']"));
        //css voi tagName
        driver.findElement(By.cssSelector("input"));
        //css voi Link
        driver.findElement(By.cssSelector("a[href='http://live.techpanda.org/index.php/customer/account/']"));
        //css voi partialLink
        driver.findElement(By.cssSelector("a[href*='index.php/customer/account/']"));


    }
    public void TC_08_Xpath() {
        driver.findElement(By.xpath("//input[@id='email']"));
        driver.findElement(By.xpath("//div[@class=account-login']"));
        driver.findElement(By.xpath("//input[@name='login[username]']"));
        driver.findElement(By.xpath("//input"));
        driver.findElement(By.xpath("//a[@href='http://live.techpanda.org/index.php/customer/account/']"));
        driver.findElement(By.xpath("//a[contain(@href,'customer/account')]"));
    }
    @AfterClass
    public void afterClass()
    {

    }
}
