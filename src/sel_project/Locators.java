package sel_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:\\Backup 09.09.2024\\eclipse-workspace\\selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("aswdfgh");
	//	WebElement uname = driver.findElement(By.name("email"));
	//	uname.sendKeys("magash@234");
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("123456");
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		System.out.println("facebook login successsfully");
		Thread.sleep(2000);
		driver.close();
		
		
		
	
		
	}

}
