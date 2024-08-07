package webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertssss { 
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/alerts");
		
//		WebElement w1 = driver.findElement(By.id("alertButton"));
//		w1.click();
//		
//		Alert a = driver.switchTo().alert();
//		String s = a.getText();
//		System.out.println(s);
//		a.accept();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		WebElement w2 = driver.findElement(By.id("confirmButton"));
//		js.executeScript("arguments[0].scrollIntoView(true)", w2);
//		w2.click();
//		
//		Alert b = driver.switchTo().alert();
//		String s1 = b.getText();
//		System.out.println(s1);
//		b.dismiss();
		
		WebElement w3 = driver.findElement(By.id("promtButton"));
		js.executeScript("arguments[0].scrollIntoView(true)", w3);
		w3.click();
		
		Alert c = driver.switchTo().alert();
		c.sendKeys("Aswin");
		String s2 = c.getText();
		System.out.println(s2);
		c.accept();
		
	}

}
