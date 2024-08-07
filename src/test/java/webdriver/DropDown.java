package webdriver;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.get("https://theautomationzone.blogspot.com/2020/07/basic-dropdown.html");
//		WebElement dropDown = driver.findElement(By.tagName("select"));
//		Select s = new Select(dropDown);
//		s.selectByIndex(21);
//		Thread.sleep(2000);
//		s.selectByValue("IND");
//		Thread.sleep(2000);
//		s.selectByVisibleText("Cuba");
		
//		List<WebElement> options = s.getOptions();
//		for(int i=options.size()-1;i>=0;i--) {
//		WebElement w = options.get(i);
//		String str = w.getText();
//		System.out.println(str);
//		}
		
//		boolean multiple = s.isMultiple();
//		System.out.println(multiple);
		
		WebElement w2 = driver.findElement(By.xpath("//select[@id='cars']"));
		Select s2 = new Select(w2);
		s2.selectByIndex(0);
		s2.selectByValue("opel");
		s2.selectByVisibleText("Audi");
		
//		List<WebElement> allSelected = s2.getAllSelectedOptions();
//		for(int i=0;i<allSelected.size();i++) {
//			WebElement all = allSelected.get(i);
//			String str2 = all.getText();
//			System.out.println(str2);
//		}
		//s2.deselectAll();
		//s2.deselectByIndex(0);
		//s2.deselectByValue("opel");
		//s2.deselectByVisibleText("Audi");
		
		//boolean mul = s2.isMultiple();
		//System.out.println(mul);
		
		WebElement firstSelected = s2.getFirstSelectedOption();
		System.out.println(firstSelected.getText());
	}

}
