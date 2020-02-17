package myselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AutomationSiteLoginTest {
    @Test
    public void loginTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Java\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Sign in")).click();
        System.out.print("Title of the page=== " + driver.getCurrentUrl());
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("shiv1@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("shiv123");
        driver.findElement(By.id("SubmitLogin")).click();
        driver.quit();
    }
}