package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsExample {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
//		String url = "https://www.facebook.com/";
//		driver.navigate().to(url);
		driver.navigate().to("https://demoqa.com/radio-button");
		
//		WebElement user = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")); //find element using locator
//		if(user.isDisplayed()) {
//		user.sendKeys("aswinraj@gmail.com");  //pass this value
//		user.clear();
//		user.sendKeys("selenium");
//		}
//		
//		String attribute = user.getAttribute("placeholder");
//		System.out.println(attribute);
//		String attribute1 = user.getAttribute("value");
//		System.out.println(attribute1);
//		
//		WebElement pass = driver.findElement(By.name("pass"));
//		pass.sendKeys("12345");
		
//		WebElement log = driver.findElement(By.linkText("Log in"));  
//		log.click();
		
//		WebElement forgot = driver.findElement(By.partialLinkText("Forgotten"));
//		forgot.click();
		
//		List<WebElement> l1 = driver.findElements(By.tagName("b"));
//		System.out.println(l1.size());
//		for(int i=0;i<l1.size();i++) {
//			WebElement w = l1.get(i);
//			String s = w.getText();
//			System.out.println(s);
//		}
		
//		WebElement x = driver.findElement(By.xpath("//input[@type='text']"));
//		x.sendKeys("aswin");
		
//		WebElement y = driver.findElement(By.xpath("//button[text()='Log in']"));
//		y.click();
		
//		WebElement z = driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]"));
//		z.sendKeys("aswinraj");
//		
//		WebElement w = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
//		w.click();
		
//		WebElement w1 =driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
//		w1.click();
//		Thread.sleep(5000);
//		if(w1.isSelected()) {
//			System.out.print("it is selected");
//		}	
//		else {
//			System.out.print("it is not selected");
//		}
		
		WebElement w2 =driver.findElement(By.xpath("//img[@src='/images/zero-step.jpeg']"));
		
		w2.click();
		
		
		
	}
}
