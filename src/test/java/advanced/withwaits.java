package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class withwaits {

    WebDriver driver;

    @BeforeMethod
    public void add_driver(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice/");
    }

    @Test
    public void vait(){
        WebElement base_url=driver.findElement(By.linkText("Test Exceptions"));
        base_url.click();

        WebElement add_btn=driver.findElement(By.id("add_btn"));
        add_btn.click();
        WebDriverWait wait_one=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement input=wait_one.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='row2']//input")));
        if(input.isDisplayed()){
            System.out.println("true");
        }else{
            System.out.println("false");
        }




    }
}
