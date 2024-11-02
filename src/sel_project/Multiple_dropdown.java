package sel_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_dropdown {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Backup 09.09.2024\\eclipse-workspace\\selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html#google_vignette");
		WebElement ide = driver.findElement(By.xpath("//select[@multiple='true']"));
        
		Select s=new Select(ide);
		System.out.println(s.isMultiple());
		
		s.selectByIndex(3);
		
		s.selectByIndex(0);
		s.selectByIndex(1);
		
		//get options--->to get all the options from the dropdown
		
		List<WebElement> alloptions=s.getOptions();
		//gettext() --->to get the values from the webpage
		for (WebElement w : alloptions) {
			System.out.println(w.getText());
		}
		
			//get all selected options--->to get all selected options from the dropdown
			System.out.println("-----get all selected options");
		List<WebElement> allselectedoptions=s.getAllSelectedOptions();
		for (WebElement we : allselectedoptions) {
			System.out.println(we.getText());
		}
		
			//getfirstselectedoption()--->to get the first selected option
		System.out.println("----firstselectedoption from the dropdown");
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			System.out.println(firstSelectedOption.getText());
			//deselect
			s.deselectByIndex(1);
			
		}
			
		
		
	}
