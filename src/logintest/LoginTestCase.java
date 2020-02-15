package logintest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

class LoginTestCase {
	public static void main(String [] args) throws InterruptedException{
		//System.setProperty("webdriver.chrome.driver",path of executable file "Chromedriver.exe")
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Java\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		LoginTest loginTest=new LoginTest(driver);

		loginTest.startTest();
		Thread.sleep(2000);
		driver.quit();
	}
}
