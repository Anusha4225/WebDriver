package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		
		
		WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
		UserName.sendKeys("abc@xyz");
		
		WebElement Password = driver.findElement(By.xpath("//*[@name='pass']"));
		Password.sendKeys("abc@xyz");

		WebElement LoginButton = driver.findElement(By.xpath("//button[@name = 'login']"));
		LoginButton.click();
	}

}
