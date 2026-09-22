package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class simple_one {
    WebDriver driver;

    @BeforeMethod
    public void add_driver(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice/");
    }
    @Test
    public void test_links() throws InterruptedException {
        System.out.println("current url is "+driver.getCurrentUrl());
        System.out.println("current title is "+driver.getTitle());

        List<WebElement> countlinks=driver.findElements(By.tagName("a"));
        System.out.println("page all link count is "+ countlinks.size());

        WebElement log_link=driver.findElement(By.xpath("//a[text()='Test Login Page']"));
        Thread.sleep(3000);
        System.out.println(log_link.getAttribute("href"));
        log_link.click();

        String page=driver.getTitle();
        System.out.println(page);
        if(page.contains("Test Login ")){
            System.out.println("pass");
        }else{
            System.out.println("fails");
        }


        WebElement username=driver.findElement(By.id("username"));
        username.sendKeys("student");
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("Password123");

        Thread.sleep(3000);

        WebElement button=driver.findElement(By.id("submit"));
        button.click();

        System.out.println(driver.getTitle());






    }
}
