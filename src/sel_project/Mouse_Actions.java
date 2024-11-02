package sel_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Backup 09.09.2024\\eclipse-workspace\\selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	//	driver.get("https://www.amazon.in/");
		Actions a=new Actions(driver);
	//	WebElement mob = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		//CLICK
	//	a.click(mob).build().perform();
		
		//RIGHT CLICK
	//	a.contextClick(mob).build().perform();
		//MOVE TO ELEMENT
//		WebElement access = driver.findElement(By.xpath("//a[@aria-label='Mobiles & Accessories,"
//				+ " You are currently on a drop-down. To open this drop-down, Press Enter.']"));
//		a.moveToElement(access).build().perform();
		
		//DRAG AND DROP
//		driver.get("https://demoqa.com/droppable/");
//		driver.manage().window().maximize();
//		WebElement drag = driver.findElement(By.id("draggable"));
//		a.click(drag).build().perform();
//		WebElement drop = driver.findElement(By.id("droppable"));
//		a.dragAndDrop(drag, drop).build().perform();
		
		//DOUBLE CLICK
//		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
//		WebElement button = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
//        a.doubleClick(button).build().perform();
		//CLICK AND HOLD
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
	    WebElement letter=driver.findElement(By.name("G"));
	    a.clickAndHold(letter).build().perform();
	    Thread.sleep(2000);
	    //RELEASE
	    a.release(letter).build().perform();
	    

}
}