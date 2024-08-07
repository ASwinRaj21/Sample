package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSample {
	public static void main(String[] args) throws InterruptedException  {
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\aswin\\eclipse-workspace\\Sample\\target\\driver\\msedgedriver.exe");
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		String url = "https://www.facebook.com/";
		
		//driver.get("https://facebook.com/"); //goes to this browser
		driver.manage().window().maximize(); //maximize the driver
		Thread.sleep(3000); // delays 3s
		
		//driver.manage().window().minimize(); //minimize the driver
		
		driver.navigate().to(url); //goes to this browser same like get()
		driver.navigate().back();  //back 
		Thread.sleep(3000);
		driver.navigate().forward(); //forward 
		Thread.sleep(3000);
		driver.navigate().refresh(); //refresh 
		driver.switchTo().newWindow(WindowType.TAB); //opens new tab
		driver.get("https://facebook.com");
		
		//driver.switchTo().newWindow(WindowType.WINDOW); //opens new window
		
		String currenturl = driver.getCurrentUrl(); //to get the current url
		System.out.println(currenturl);
		
		if(url.equals(currenturl)) {
			System.out.println("Url is matched");
		}
		else {
			System.out.println("Url not matched");
		}
		
//		driver.close(); // close the browser
		
		String title = driver.getTitle(); //gets title of the browser
		System.out.println(title);
		
		String pagesource = driver.getPageSource(); //gets the page source from the browser
		System.out.println(pagesource);
		
		driver.quit();  //close the driver
		
	}
}
