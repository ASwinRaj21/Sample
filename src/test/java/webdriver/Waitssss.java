package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waitssss { 
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
//		WebElement w = driver.findElement(By.xpath("//input[@type='text']"));
//		w.sendKeys("iphone");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); //explicit wait
		WebElement until = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='txt']")));
		until.sendKeys("iphone",Keys.ENTER);
		
		
	}

}
