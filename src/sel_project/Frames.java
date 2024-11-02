package sel_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	//FRAMES - IT HAS A SEPERATE HTML TAG INSIDE THE DOM STRUCTURE
	//       -TAGNAME=IFRAME
	//METHOD - driver.switchTo().frame();
	//1.FRAME(INDEX);
	//2.FRAME(ID OR NAME);
	//3.FRAME(WEB ELEMENT REFERENCE);
	
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","D:\\Backup 09.09.2024\\eclipse-workspace\\selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/frame");
		//SWITCH BY NAME OR ID
		driver.switchTo().frame("firstFr");
		driver.findElement(By.name("fname")).sendKeys("qwerty");
		//SWITCH BY WEBELEMENT REFERENCE
		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(innerframe);
		driver.findElement(By.name("email")).sendKeys("awesome@gmail.com");
		//SWITCH BY PARENRT FRAME
		driver.switchTo().parentFrame();
		driver.findElement(By.name("lname")).sendKeys("asdfgh");
		//SWITCH BY INDEX
		driver.switchTo().frame(1);
		driver.findElement(By.name("email")).clear();
		//DEFAULT CONTENT
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Work-Space']")).click();
		
		
}
}