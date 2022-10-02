package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SignUpEdvora {

    WebDriver driver;

    // public static void main(String[] args) throws InterruptedException {
    @BeforeTest
    public void beforeTest() {


        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/");
        // driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        // driver.findElement(By.xpath("//label[text()=\"Username\"]")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void createAccount() throws InterruptedException {
        driver.findElement(By.xpath("//button[contains(text(),'SignIn')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("testingse2@gmail.com");
        //driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Selenium5");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'Create Account')]")).click();
        driver.switchTo().alert().accept();


    }
@AfterTest
    public void afterTest() {
        //driver.close();
    }

}

    // driver.close();

