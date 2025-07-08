package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_04_Relative_Locator {
    WebDriver driver;
    @BeforeClass
    public void beforeClass() {
        //Khoi tao trinhh duyet
        driver = new ChromeDriver();
            }
    @Test
    public void TC_01_ID() {
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
        WebElement rememberMeText =  driver.findElement(RelativeLocator.with(By.tagName("label"))
                .above(By.cssSelector("button.login-button"))
                .below(By.id("password"))
                .toRightOf(By.id("RememberMe")));
        System.out.println(rememberMeText.getText());

    }


    @AfterClass
    public void afterClass()
    {

    }
}
