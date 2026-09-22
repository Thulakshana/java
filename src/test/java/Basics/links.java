package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class links {

    WebDriver driver;

    @BeforeMethod
    public void drivers() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practicetestautomation.com/practice/");
    }

    @Test
    public void link_one() throws InterruptedException {

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        System.out.println(
                "Home exists = " +
                        driver.getPageSource().contains("Home")
        );

        WebElement link2 =
                driver.findElement(
                        By.xpath("//a[text()='Test Login Page']")
                );

        // Get href BEFORE clicking
        String ln = link2.getAttribute("href");

        System.out.println("Link = " + ln);

        // Click
        link2.click();

        Thread.sleep(3000);

        // Get new page title
        String title = driver.getTitle();

        System.out.println("New title = " + title);

        if (title.toLowerCase().contains("login")) {

            System.out.println("Login page opened");

        } else {

            System.out.println("Login page NOT opened");
        }
    }

    @AfterMethod
    public void closee() {

        driver.quit();
    }
}