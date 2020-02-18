package signupselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

class SignUpAutomation {
    static WebDriver driver;
//    static WebDriver driver=new ChromeDriver();
    SignUpAutomation(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Java\\drivers\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.linkText("REGISTER")).click();
    }
/*
    public void setFirstName(String fname) {
        driver.findElement(By.name("firstName")).sendKeys(fname);
    }

    public void setLastName(String lname) {
        driver.findElement(By.name("firstName")).sendKeys(lname);
    }

    public void setPhone(String phone) {
       File srcFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        driver.findElement(By.name("firstName")).sendKeys(phone);
    }

    public void setUserName(String userName) {
        driver.findElement(By.name("firstName")).sendKeys(userName);
    }

    public void setAddress1(String address1) {
        driver.findElement(By.name("firstName")).sendKeys(address1);
    }

    public void setAddress2(String address2) {
        driver.findElement(By.name("firstName")).sendKeys(address2);
    }

    public void setCity(String city) {
        driver.findElement(By.name("firstName")).sendKeys(city);
    }

    public void setState(String state) {
        driver.findElement(By.name("firstName")).sendKeys(state);
    }

    public void setPostalCode(String postalCode) {
        driver.findElement(By.name("firstName")).sendKeys(postalCode);
    }

    public void setEmail(String email) {
        driver.findElement(By.name("firstName")).sendKeys(email);
    }

    public void setPassword(String password) {
        driver.findElement(By.name("firstName")).sendKeys(password);
    }

    public void setConfirmPassword(String confirmPassword) {
        driver.findElement(By.name("firstName")).sendKeys(confirmPassword);
    }

    public static void startTesting() {
        signupselenium.SignUpAutomation signUpAutomation = new signupselenium.SignUpAutomation();
        signUpAutomation.setFirstName("Shiv");
        signUpAutomation.setLastName("Hegonde");
        signUpAutomation.setPhone("9988778899");
        signUpAutomation.setUserName("shiv@gmail.com");
        signUpAutomation.setAddress1("Hadapsar");
        signUpAutomation.setAddress2("Pune");
        signUpAutomation.setCity("Pune");
        signUpAutomation.setState("Maharashtra");
        signUpAutomation.setPostalCode("411111");
        signUpAutomation.setEmail("shiv@gmail.com");
        signUpAutomation.setPassword("shiv123");
        signUpAutomation.setConfirmPassword("shiv123");
    }
*/
}
