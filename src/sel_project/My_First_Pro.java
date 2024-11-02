package sel_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class My_First_Pro {
	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Backup 09.09.2024\\eclipse-workspace\\selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Mobiles']")).click();
        driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
        Thread.sleep(2000);
		WebElement price = driver.findElement(By.xpath("//div[text()='79,999']/parent::div/child::div"));
        System.out.println(price.getText());
	}

}
