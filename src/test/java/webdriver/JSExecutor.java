package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.AllArguments;

public class JSExecutor  {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(); //upcast
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement user = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.linkText("Log in"));
		
		JavascriptExecutor  js = (JavascriptExecutor)driver; //downcast
		js.executeScript("arguments[0].setAttribute('value','Selenium')",user,pass,login);
		js.executeScript("arguments[1].setAttribute('value','123asd')",user,pass,login);
		
//		Object o =js.executeScript("return arguments[0].getAttribute('value')", user);
//		System.out.println(o);
//		js.executeScript("arguments[2].click()",user,pass,login);
		
//		js.executeScript("arguments[0].setAttribute('style','background:yellow')", user,pass);
//		js.executeScript("arguments[1].setAttribute('style','background:green;border:2px solid black')",  user,pass);
//		
//		String cssValue = pass.getCssValue("background-color");
//		System.out.println(cssValue);
		
		WebElement down = driver.findElement(By.xpath("//a[text()='Careers']"));
		js.executeScript("arguments[0].scrollIntoView(true)", down);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(false)", user);
		
	}

}
