package sel_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	//WEBTABLE ==A TABLE WHICH IS PRESENT IN THE WEBPAGE
	
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","D:\\Backup 09.09.2024\\eclipse-workspace\\selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://cosmocode.io/automation-practice-webtable/");
        List<WebElement> web  = driver.findElements(By.xpath("//table/tbody/tr/td"));
        for (WebElement webE : web) {
        	System.out.println(webE.getText());
			}
        List<WebElement> row  = driver.findElements(By.xpath("//table/tbody/tr[4]/td")); 
        for (WebElement we : row) {
        	System.out.println(we.getText());
			}
        List<WebElement> column  = driver.findElements(By.xpath("//table/tbody/tr/td[4]"));
        for (WebElement w : column) {
        	System.out.println(w.getText());
			}
        WebElement element = driver.findElement(By.xpath("//table/tbody/tr[4]/td[4]"));
        System.out.println(element.getText());
}
}