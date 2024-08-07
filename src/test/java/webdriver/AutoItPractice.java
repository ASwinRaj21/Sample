package webdriver;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoItPractice {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=Cj0KCQjwzby1BhCQARIsAJ_0t5OqzYFk3Gaw0hGVzxKZfKbEKRNNzEQTfsWL9-QZge3wTnI-lm93j-0aAh3SEALw_wcB&gclsrc=aw.ds");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement resume = driver.findElement(By.xpath("//h2[@class='main-3']"));
		js.executeScript("arguments[0].scrollIntoView(true)", resume);
		resume.click();
		Thread.sleep(2000);
		WebElement upload = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		upload.click();
		Runtime.getRuntime().exec("C:\\Users\\aswin\\Downloads\\newsci2");
	}

}
