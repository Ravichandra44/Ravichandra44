import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class EndvoreLogin {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/");
       // driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
       // driver.findElement(By.xpath("//label[text()=\"Username\"]")).click();
       driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("testingse2@gmail.com");
        //driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
       // driver.findElement(By.xpath("//label[text()=\"Password\"]")).click();
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Selenium5");
       // Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
       // driver.close();



    }
    }




