package webdriver;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement search = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		search.sendKeys("iphone",Keys.ENTER);
		
		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[3]")).click();
		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[4]")).click();
		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[5]")).click();
		Thread.sleep(3000);
		
		String parentWindow = driver.getWindowHandle();
		//System.out.println(parentWindow);
		
		Set<String> allWindows = driver.getWindowHandles();
		List<String> li = new ArrayList<String>(allWindows);
		driver.switchTo().window(li.get(2));
		//System.out.println(allWindows);
		
//		for(String x:allWindows) {
//			if(!parentWindow.equals(allWindows)) {
//				driver.switchTo().window(parentWindow);
//			}
//		}
		//driver.switchTo().window(parentWindow);
		
	}

}
