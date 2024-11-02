package sel_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_selector {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Backup 09.09.2024\\eclipse-workspace\\selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/index.php/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//ID --->#
		driver.findElement(By.cssSelector("#email")).sendKeys("priya");
		
		//CLASS --->.[dot]
		//we can't use index in class
		 //syntax
		//tagname[att_name='att_value']
		//[att_name='att_value']
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("12345");
//		driver.findElement(By.cssSelector("[type='password']")).sendKeys("3456");
		
		//PREFIX --->^
//		driver.findElement(By.cssSelector("[type^='p']")).sendKeys("awesdr");
		//SUFFIX --->$
//		driver.findElement(By.cssSelector("[type$='d']")).sendKeys("qwerty");
		//CONTAINS OR SUBSTRING --->*
//		driver.findElement(By.cssSelector("[type*='pass']")).sendKeys("ghjik");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[value='1']")).click();
		System.out.println("we clicked the login button,but our password is wrong");
		driver.close();
		
	}

}
