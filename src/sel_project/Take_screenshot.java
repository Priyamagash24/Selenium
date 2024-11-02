package sel_project;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Take_screenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Backup 09.09.2024\\eclipse-workspace\\selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/index.php/");
		driver.manage().window().maximize();
		TakesScreenshot t =(TakesScreenshot)driver;
		File screenshotAs = t.getScreenshotAs(OutputType.FILE);
		File folFile=new File("C:\\Users\\PC Corner\\Desktop\\TestNg\\target\\fblogin.png");
		FileHandler.copy(screenshotAs, folFile);
		System.out.println("screenshot taken successfully");
	}

}
