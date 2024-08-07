package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Framesss {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/nestedframes");
		
		driver.switchTo().frame("frame1");
		WebElement ele = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(ele);
		
		WebElement w = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		String s = w.getText();
		System.out.println(s);
		
		driver.switchTo().parentFrame();
		String s2 = driver.findElement(By.xpath("//*[text()='Parent frame']")).getText();
		System.out.println(s2);
		
		driver.switchTo().defaultContent();
		String s1 = driver.findElement(By.xpath("//h1[text()='Nested Frames']")).getText();
		System.out.println(s1);
		
	}

}
