package sel_project;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Alerts {
	//ALERT--->IT IS NON INSPECT
	//     --->IT DOESNOT HAVE ANY DOM STRUCTURE
	//     --->IT IS AN INTERFACE
	
	//driver.switchTo().alert(); --->to switch the driver to the alert box
	
	//accept(); --->to click the button
	//dismiss(); --->to cancel the button
	//sendkeys(); --->to send the values
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Backup 09.09.2024\\eclipse-workspace\\selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		
		//SIMPLE ALERT --->THE ALERT WITH ONLY HAVING OK BUTTON
		Alert simple = driver.switchTo().alert();
		Thread.sleep(2000);
		simple.accept();
		//CONFIRM ALERT --->THE ALERT HAVING OK AND CANCEL BUTTON
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Alert confirm = driver.switchTo().alert();
		Thread.sleep(2000);
		confirm.dismiss();
		//PROMPT ALERT --->THE ALERT HAVING TEXT BOX
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		Alert prompt=driver.switchTo().alert();
		Thread.sleep(2000);
		prompt.sendKeys("priya");
		prompt.accept();
		
	}

}
