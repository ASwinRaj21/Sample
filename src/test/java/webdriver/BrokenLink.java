package webdriver;

import java.net.HttpURLConnection;

import java.util.Iterator;
import java.util.List;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeOptions option = new EdgeOptions();
		option.addArguments("--start-maximized");
		
		WebDriver driver = new EdgeDriver(option);
		driver.get("https://www.amazon.in/");
		List<WebElement> links = driver.findElements(By.tagName("link"));
		Iterator<WebElement> iterator = links.iterator();
		while(iterator.hasNext()) {
			WebElement link = iterator.next();
			String href = link.getAttribute("href");
			if(href==null || href.isEmpty()) {
				 System.out.println("Given Link is Empty");
			}
			else if(!href.startsWith("https://www.amazon.in/")){
				System.out.println("Given link is not ours "+href);
			}
			else {
				try {
				HttpURLConnection http = (HttpURLConnection) ((new URL(href)).openConnection());
				http.setRequestMethod("HEAD");
				http.connect();
				int responseCode = http.getResponseCode();
				if(responseCode==200) {
					System.out.println("Not a Broken link "+href);
				}
				else {
					System.out.println("Broken link "+href );
				}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
