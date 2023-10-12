package com.test.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomepageTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

//Login
        driver.findElement(By.xpath("//a[@title='My Account']")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("input-email")).sendKeys("s.priya@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("kpriya@123");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
//Validate account page
        System.out.println(driver.findElement(By.xpath("//*[@class='breadcrumb']//a[text()='Account']")).isDisplayed()); //true
//add item to the cart
        driver.findElement(By.xpath("//input[@name='search'] [@class='form-control input-lg']")).sendKeys("iPhone");
        driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
        driver.findElement(By.linkText("iPhone")).click();
        driver.findElement(By.id("input-quantity")).clear();
        driver.findElement(By.id("input-quantity")).sendKeys("2");
        driver.findElement(By.id("button-cart")).click();
//validate success message
        WebElement successStatus = driver.findElement(By.xpath("//*[@class='alert alert-success alert-dismissible']"));
        String successStatusText = successStatus.getText();
        System.out.println(successStatusText);

        driver.findElement(By.linkText("Shopping Cart")).click();
        driver.findElement(By.linkText("Checkout")).click();
//validate Alert message
        WebElement alertMessage = driver.findElement(By.xpath("//*[@class='alert alert-danger alert-dismissible']"));
        String alertText = alertMessage.getText();
        System.out.println(alertText);
        System.out.println("Checkout Failed");

        driver.quit();
    }

}
