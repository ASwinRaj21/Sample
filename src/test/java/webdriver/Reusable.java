package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reusable {
	static WebDriver driver;
	public static void webDriv(String url) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.navigate().to(url);
		
	}
	public static void max() {
		driver.manage().window().maximize();
	}
	public static void findele(String locator,String username) {
		WebElement user= driver.findElement(By.xpath(locator));
		user.sendKeys(username);
	}
	public static void pageTitle() {
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
	}
	public static void currentUrl() {
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
	}
	public static void findeles(String locators) {
		List<WebElement> l1 = driver.findElements(By.tagName(locators));
		System.out.println(l1.size());
		for(int i=0;i<l1.size();i++) {
			WebElement w = l1.get(i);
			String s = w.getText();
			System.out.println(s);
		}
	}
	public static void getAtt(String att,String value) {
		WebElement user= driver.findElement(By.xpath(att));
		String val = user.getAttribute(value);
		System.out.println(val);
	}
	public static void display(String password,String passkey) {
		WebElement pass = driver.findElement(By.id(password));
		if(pass.isDisplayed()  ) {
			pass.sendKeys(passkey);
		}
		else {
			System.out.println("Field is not displayed");
		}
	}
	public static void enable(String login) {
		WebElement enab = driver.findElement(By.linkText(login));
		if(enab.isEnabled()) {
			enab.click();
		}
		else {
			System.out.println("Log in is not enabled");
		}
	}
	public static void newTab(String anotherUrl) {
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to(anotherUrl);
	}
	public static void select(String sel) throws InterruptedException {
		WebElement select = driver.findElement(By.xpath(sel));
		Thread.sleep(5000);
		select.click();
		
		if(select.isSelected()) {
			System.out.print("it is selected");
		}	
		else {
			System.out.print("it is not selected");
		}
	}
	public static void close() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}
	public static void sleep() throws InterruptedException {
		Thread.sleep(3000);
	}
	

}
