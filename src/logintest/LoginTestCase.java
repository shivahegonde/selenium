package logintest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.IOException;

class LoginTestCase {
    public static void main(String args[]) throws InterruptedException, IOException {
        //System.setProperty("webdriver.chrome.driver",path of executable file "Chromedriver.exe")
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Java\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        LoginTest loginTest = new LoginTest(driver);
        loginTest.beginTest();
        Thread.sleep(10000);
        driver.quit();
    }
}
