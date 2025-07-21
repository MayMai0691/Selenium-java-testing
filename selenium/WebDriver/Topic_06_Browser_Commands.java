package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;

public class Topic_06_Browser_Commands {
    WebDriver driver;
   // static WebDriver firstDrive();
   // final WebDriver secondDriver = new FirefoxDriver();
   // String nopEcommerceUrl = "https://demo.nopcommerce.com/";
    @BeforeClass
    public void beforeClass(){
        driver = new ChromeDriver();
        driver.get("https://live.techpanda.org/index.php/customer/account/login/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

    }
    @Test
    public void TC_01(){
        //Mở ra 1 page url
        driver.get("");

        //Đóng trình duyệt đóng hết tất cả
        driver.quit();

        //Đóng trình duyệt
        driver.close();

        //Tìm 1 element
        driver.findElement(By.cssSelector(""));

        //Tìm nhiều element
        driver.findElements(By.cssSelector(""));

        //Lấy url
        Assert.assertEquals(driver.getCurrentUrl(),"https://live.techpanda.org/index.php/customer/account/login/");

        //Lấy title của page
        driver.getTitle();

        driver.getWindowHandle();

        driver.getWindowHandles();

        //Mở rộng browser
        driver.manage().window().maximize();

        //Thu nhỏ browser
        driver.manage().window().minimize();

        //full mh
        driver.manage().window().fullscreen();

        //Set kích thước của trình duyệt
        driver.manage().window().setSize(new Dimension(1920,1080));

        //Lấy ra kích thước của browser là bao nhiêu
        driver.manage().window().getSize();

        //Lấy tọa độ của browser đang đứng
        driver.manage().window().getPosition();

        //Set tk elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30000));
        driver.manage().timeouts().getImplicitWaitTimeout();


        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().getScriptTimeout();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().getPageLoadTimeout();
    }
    @AfterClass
    public void afterClass(){
        driver.quit();
}
}
