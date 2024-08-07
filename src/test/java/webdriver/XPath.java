package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		
		EdgeOptions option = new EdgeOptions();
		option.addArguments("--start-maximized");
		//option.addArguments("--headless");
		option.addArguments("--disable-popups");
		option.addArguments("--disable-notifications");
		
		WebDriver driver = new EdgeDriver(option);
		driver.get("https://www.amazon.in/");
		WebElement w = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[4]/div[2]//a[6]")); //absolute xpath
		//w.click();
		
		WebElement w1 = driver.findElement(By.xpath("//span[contains(text(),'Returns')]/parent::a")); //xpath axes parent
//		String s = w1.getText();
//		System.out.println(s);
		
		WebElement w2 = driver.findElement(By.xpath("//span[contains(text(),'& Orders')]/preceding-sibling::span")); //xpath axes preceding sibling
//		String s2 = w2.getText();
//		System.out.println(s2);
		
		WebElement w3 = driver.findElement(By.xpath("//span[contains(text(),'Returns')]/following-sibling::span")); //xpath axes following sibling
//		String s3 = w3.getText();
//		System.out.println(s3);
		
		WebElement w4 = driver.findElement(By.xpath("//span[contains(text(),'Returns')]/ancestor::div[@id='navbar']")); //xpath axes ancestor
//		String s4 = w4.getText();
//		System.out.println(s4);
		
		WebElement w5 = driver.findElement(By.xpath("//img[@alt='boult']/preceding::div[@id='nav-logo']")); //xpath axes preceding
//		String s5 = w5.getText();
//		System.out.println(s5);
		Thread.sleep(3000);
		
		WebElement w6 = driver.findElement(By.xpath("//img[@alt='boAt']/following::div/span[contains(text(),'Starting ₹349 | boult')]")); //xpath axes following
//		String s6 = w6.getText();
//		System.out.println(s6);
        
		WebElement w7 = driver.findElement(By.xpath("//div[@id='nav-belt']/descendant::div[@id='nav-search']")); //xpath axes descendant
		String s7 = w7.getText();
		System.out.println(s7);
    }

		
	}


