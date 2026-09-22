package Basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Driver;

public class alert {
    WebDriver driver;
    @BeforeMethod
    public void driv(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/alert.xhtml");
    }

    @Test
    public void alert_one() throws InterruptedException {
        WebElement one=driver.findElement(By.id("j_idt88:j_idt91"));
        one.click();

        Alert alt=driver.switchTo().alert();
        alt.accept();

        Thread.sleep(3000);

        WebElement two=driver.findElement(By.id("j_idt88:j_idt104"));
        two.click();

        alt.sendKeys("hello");
        Thread.sleep(3000);
        alt.accept();





    }
}
