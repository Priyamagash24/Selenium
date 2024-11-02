package sel_project;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handle {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Backup 09.09.2024\\eclipse-workspace\\selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		Thread.sleep(2000);
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		for(String x : windowHandles) {
			System.out.println(x);
			
			if(!x.equals(windowHandle)) {
				System.out.println(x);
				driver.switchTo().window(x);
				driver.manage().window().maximize();
			}
		}

	}
}
