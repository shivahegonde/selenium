package logintest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.IOException;

class LoginTest {
    WebDriver driver;
    By myEmail = By.id("email");
    By myPassword = By.id("passwd");
    By loginButton = By.id("SubmitLogin");
    By xPathHover = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a");

    public LoginTest(WebDriver driver) {
        this.driver = driver;
    }

    @Test //This is TestNG annotation

    public void beginTest() throws IOException, InterruptedException {
        driver.findElement(By.linkText("Sign in")).click();
        System.out.print("Title of the page=== " + driver.getCurrentUrl());
        Thread.sleep(2000);
        setEmail("shiv1@gmail.com");
        setPassword("shiv123");
        clickOperation(loginButton);
        Thread.sleep(300);
        Actions action = new Actions(driver);
        By womenXPath = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a");
        hoverMouse(womenXPath);
        clickOperation(xPathHover);
        Thread.sleep(300);
        By product = By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img");
        hoverMouse(product);
        clickOperation(By.linkText("Add to cart"));
        Thread.sleep(3000);
        clickOperation(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
        Thread.sleep(300);
        clickOperation(By.linkText("Proceed to checkout"));
        Thread.sleep(3000);
        clickOperation(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
        Thread.sleep(3000);
        WebElement acceptTerm = driver.findElement(By.name("cgv"));
        acceptTerm.click();
        Thread.sleep(3000);
        clickOperation(By.xpath("//*[@id=\"form\"]/p/button/span"));
        clickOperation(By.linkText("Pay by bank wire (order processing will be longer)"));
        Thread.sleep(300);
        clickOperation(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
        Thread.sleep(300);
        By account = By.className("header_user_info");
        Thread.sleep(300);
        clickOperation(account);
        Thread.sleep(300);
        clickOperation(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span"));
        Thread.sleep(1000);
        clickOperation(By.xpath("//*[@id=\"order-list\"]/tbody/tr/td[6]/a"));

    }

    private void clickOperation(By by) {
        driver.findElement(by).click();

    }


    public void hoverMouse(By path) {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(path);
        action.moveToElement(we).build().perform();
    }

    public void setEmail(String email) {
        driver.findElement(myEmail).sendKeys(email);
    }

    public void setPassword(String password) {
        driver.findElement(myPassword).sendKeys(password);
    }

}
