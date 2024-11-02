package sel_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Single_dropdown {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Backup 09.09.2024\\eclipse-workspace\\selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement acc = driver.findElement(By.xpath("//a[text()='Create new account']"));
		acc.click();
	    Thread.sleep(2000);
		WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Thread.sleep(5000);
		Select s=new Select(day);
		s.selectByValue("12");
		//s.selectByIndex(11);
		//s.selectByVisibleText("12");
		Thread.sleep(2000);
		WebElement month=driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Thread.sleep(5000);
		Select s1=new Select(month);
		s1.selectByIndex(0);
		//s1.selectByVisibleText("Jan");
		driver.close();
	
	}
}
