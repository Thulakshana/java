package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class navigate_and_button {
    WebDriver driver;
    @BeforeMethod
    public void driv(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/button.xhtml");
    }

    @Test
    public void buttons() throws InterruptedException {
        WebElement buttn1=driver.findElement(By.id("j_idt88:j_idt90"));
        buttn1.click();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.navigate().back();

        WebElement button2=driver.findElement(By.id("j_idt88:j_idt94"));
        Point xy=button2.getLocation();
        System.out.println(xy);


        WebElement button3=driver.findElement(By.id("j_idt88:j_idt94"));
        button3.getSize().getHeight();
        button3.getSize().getWidth();

        button3.getCssValue("background-color");





    }



}
