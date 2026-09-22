package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.security.Key;

public class keyboard {
    WebDriver driver;

    @BeforeMethod
    public void add_driver(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }

    @Test
    public void keyboard_type(){
        WebElement textbox=driver.findElement(By.name("q"));
        textbox.sendKeys("apple"+ Keys.SPACE+"is"+Keys.SPACE+"fuck");



    }
}
