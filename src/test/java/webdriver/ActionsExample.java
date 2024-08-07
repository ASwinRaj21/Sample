package webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsExample {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
//		//driver.get("https://www.flipkart.com/");
//		driver.get("https://www.facebook.com/");
//		
		Actions ac = new Actions(driver);
//		//WebElement w1 = driver.findElement(By.xpath("//*[text()='Fashion']"));
//		//ac.moveToElement(w1).perform();
//		WebElement w2 = driver.findElement(By.id("email"));
//		ac.sendKeys(w2, "Aswin").perform();
//		ac.doubleClick(w2).build().perform();
//		ac.contextClick(w2).build().perform();
//		
//		Robot r =new Robot();
//		for(int i=0;i<4;i++) {
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		}
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_V);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_V);
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement drag = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		WebElement drop = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		ac.dragAndDrop(drag, drop).build().perform();
		
		Thread.sleep(2000);
		WebElement drag1 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement drop1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		ac.dragAndDrop(drag1, drop1).build().perform();
		Thread.sleep(2000);
		WebElement drag2 = driver.findElement(By.xpath("//a[contains(text(),'SALES')]"));
		WebElement drop2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		ac.dragAndDrop(drag2, drop2).build().perform();
		Thread.sleep(2000);
		WebElement drag3 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement drop3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		ac.dragAndDrop(drag3, drop3).build().perform();
	}

}
