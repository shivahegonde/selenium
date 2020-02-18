package alerthandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\selenium\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        String baseUrl = "http://demo.guru99.com/test/upload/";
//
//        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
        // Alert Message handling

        driver.get("file:///C:/Users/Admin/Documents/Shivkumar/html/alertpopup.html");


        driver.findElement(By.id("alert")).click();

        // Switching to Alert
        Alert alert = driver.switchTo().alert();

        // Capturing alert message.
        String alertMessage = driver.switchTo().alert().getText();
        // Displaying alert message
        System.out.println(alertMessage);
        Thread.sleep(5000);
        // Accepting alert
        alert.accept();

        alert.sendKeys("asd");
        Thread.sleep(2000);
        driver.quit();
    }

}
