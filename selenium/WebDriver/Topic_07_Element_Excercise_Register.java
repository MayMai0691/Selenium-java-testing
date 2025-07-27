package WebDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_07_Element_Excercise_Register {
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){

        driver = new ChromeDriver();
    }

    @Test
    public void TC_01_Empty(){
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");

        driver.findElement(By.cssSelector("input#txtFirstname")).sendKeys("");
        driver.findElement(By.cssSelector("input#txtEmail")).sendKeys("");
        driver.findElement(By.cssSelector("input#CEEmail")).sendKeys("");
        driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("");
        driver.findElement(By.cssSelector("input#txtCPPassword")).sendKeys("");
        driver.findElement(By.cssSelector("input#txtPhone")).sendKeys("");

        driver.findElement(By.cssSelector("div.frm Register button.btn_pink_sm")).click();

        Assert.assertEquals(driver.findElement(By.cssSelector("label#txtFirstname-error")).getText(), "Vui lòng nhập họ tên");
        Assert.assertEquals(driver.findElement(By.cssSelector("label#txtEmail-error")).getText(), "Vui lòng nhập email");
        Assert.assertEquals(driver.findElement(By.cssSelector("label#txtCEEmail-error")).getText(), "Vui lòng nhập lại địa chỉ email");
        Assert.assertEquals(driver.findElement(By.cssSelector("label#txtPassword-error")).getText(), "Vui lòng nhập mật khẩu");
        Assert.assertEquals(driver.findElement(By.cssSelector("label#CPPassword-error")).getText(), "Vui lòng nhập lại mật khẩu");
        Assert.assertEquals(driver.findElement(By.cssSelector("label#txtPhone-error")).getText(), "Vui lòng nhập số điện thoại.");

    }

    @Test
    public void TC_02_Invalid_Email(){
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");

        driver.findElement(By.cssSelector("input#txtFirstname")).sendKeys("Mai Thi May");
        driver.findElement(By.cssSelector("input#txtEmail")).sendKeys("123@123");
        driver.findElement(By.cssSelector("input#CEEmail")).sendKeys("123@123");
        driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("123456");
        driver.findElement(By.cssSelector("input#txtCPPassword")).sendKeys("123456");
        driver.findElement(By.cssSelector("input#txtPhone")).sendKeys("0974738813");

        driver.findElement(By.cssSelector("div.frm Register button.btn_pink_sm")).click();
        Assert.assertEquals(driver.findElement(By.cssSelector("label#txtEmail-error")).getText(),"Vui lòng nhập email hợp lệ");

    }

    @Test
    public void TC_03_Incorrect_Email_Confirm(){
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");

        driver.findElement(By.cssSelector("input#txtFirstname")).sendKeys("Mai Thi May");
        driver.findElement(By.cssSelector("input#txtEmail")).sendKeys("maimay0691@gmail.com");
        driver.findElement(By.cssSelector("input#CEEmail")).sendKeys("maimay@gmail.com");
        driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("123456");
        driver.findElement(By.cssSelector("input#txtCPPassword")).sendKeys("123456");
        driver.findElement(By.cssSelector("input#txtPhone")).sendKeys("0974738813");

        driver.findElement(By.cssSelector("div.frm Register button.btn_pink_sm")).click();
        Assert.assertEquals(driver.findElement(By.cssSelector("label#txtCEmail-error")).getText(),"Email nhập lại không đúng");


    }

    @Test
    public void TC_03_Invalid_Password(){
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");

        driver.findElement(By.cssSelector("input#txtFirstname")).sendKeys("Mai Thi May");
        driver.findElement(By.cssSelector("input#txtEmail")).sendKeys("maimay0691@gmail.com");
        driver.findElement(By.cssSelector("input#CEEmail")).sendKeys("maimay@gmail.com");
        driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("1234");
        driver.findElement(By.cssSelector("input#txtCPPassword")).sendKeys("1234");
        driver.findElement(By.cssSelector("input#txtPhone")).sendKeys("0974738813");

        driver.findElement(By.cssSelector("div.frm Register button.btn_pink_sm")).click();
        Assert.assertEquals(driver.findElement(By.cssSelector("label#txtPassword-error")).getText(),"Mật khẩu phải có ít nhất 6 ký tự");
        Assert.assertEquals(driver.findElement(By.cssSelector("label#txtCPassword-error")).getText(),"Mật khẩu phải có ít nhất 6 ký tự");

    }

    @Test
    public void TC_04_Invalid_PhoneNum(){
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");

        driver.findElement(By.cssSelector("input#txtFirstname")).sendKeys("Mai Thi May");
        driver.findElement(By.cssSelector("input#txtEmail")).sendKeys("maimay0691@gmail.com");
        driver.findElement(By.cssSelector("input#CEEmail")).sendKeys("maimay0691@gmail.com");
        driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("123456");
        driver.findElement(By.cssSelector("input#txtCPPassword")).sendKeys("123456");
        driver.findElement(By.cssSelector("input#txtPhone")).sendKeys("09747388131111");

        driver.findElement(By.cssSelector("div.frm Register button.btn_pink_sm")).click();
        Assert.assertEquals(driver.findElement(By.cssSelector("label#txtPhone-error")).getText(),"Số điện thoại phải từ 10-11 số.");;

    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }
}
