package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {
	public static void main(String[] args) {
		 WebDriverManager.edgedriver().setup();
		 WebDriver driver = new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.in");
		 
		 WebElement w1 = driver.findElement(By.cssSelector("span#nav-link-accountList-nav-line-1")); //id
//		 String s1 = w1.getText();
//		 System.out.println(s1);
		 
		 WebElement w2 = driver.findElement(By.cssSelector("div.nav-line-1-container")); //class
//		 String s2 = w2.getText();
//		 System.out.println(s2);
		 
		 WebElement w3 = driver.findElement(By.cssSelector("div[id='nav-global-location-slot']")); //other attributes
//		 String s3 = w3.getText();
//		 System.out.println(s3);
		 
		 WebElement w4 = driver.findElement(By.cssSelector("a[data-csa-c-content-id*='nav_cs_sell_T3']")); //contains *
//		 String s4 = w4.getText();
//		 System.out.println(s4);
		 
		 WebElement w5 = driver.findElement(By.cssSelector("a[data-csa-c-content-id^='nav_cs_sell']")); //starts with ^
//		 String s5 = w5.getText();
//		 System.out.println(s5);
		 
		 WebElement w6 = driver.findElement(By.cssSelector("a[data-csa-c-content-id$='T3']")); //ends with $
//		 String s6 = w6.getText();
//		 System.out.println(s6);
		 
		 WebElement w7 = driver.findElement(By.cssSelector("a[id='nav-orders']>span:nth-of-type(2)")); //array > immediate child
//		 String s7 = w7.getText();
//		 System.out.println(s7);
		 
		 WebElement w8 = driver.findElement(By.cssSelector("div[id='nav-xshop-container'] a:nth-of-type(10)")); //array    sub child
//		 String s8 = w8.getText();
//		 System.out.println(s8);
		 
		 WebElement w9 = driver.findElement(By.cssSelector("a[class='nav_a']:last-child")); //last-child
//		 String s9 = w9.getText();
//		 System.out.println(s9);
	}

}
