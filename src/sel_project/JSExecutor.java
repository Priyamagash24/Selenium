package sel_project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Backup 09.09.2024\\eclipse-workspace\\selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement aboutus = driver.findElement(By.xpath("//a[text()='About Us']"));
		//JAVASCRIPTEXECUTOR - INTERFACE(LOWER INTERFACE)
		//by using casting method -->narrowing
		//long a=12345678;
		//short b=(short)a;
		JavascriptExecutor js=(JavascriptExecutor)driver; //narrowing
		//js.executeScript("arguments[0].scrollIntoView()", aboutus);
		js.executeScript("arguments[0].click()", aboutus);
		js.executeScript("window.scrollBy(0,3000)");
		js.executeScript("window.scrollBy(0,-1000)");
		js.executeScript("window.scroll(0,0)");
		js.executeScript("alert('priya');");
	}
}