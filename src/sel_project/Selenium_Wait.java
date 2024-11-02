package sel_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Wait {
	public static void main(String[] args) throws InterruptedException  {
		
		//thread.sleep(50000);//static wait//local wait
		//wait //dynamic wait //global wait
		//2 types of wait
		//1.Implicity wait - it is applicable for the entire program
		
		System.setProperty("webdriver.chrome.driver","D:\\Backup 09.09.2024\\eclipse-workspace\\selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(By.id("btn1")).click();
		WebElement text1 = driver.findElement(By.id("txt1"));
        text1.sendKeys("awerfg");
        
        //2.Explicity wait-it is applicable for certain condition
         WebDriverWait wait=new WebDriverWait(driver, 30);
         wait.until(ExpectedConditions.visibilityOf(text1));
         driver.findElement(By.id("btn2")).click();
         
         
         
   
}
}