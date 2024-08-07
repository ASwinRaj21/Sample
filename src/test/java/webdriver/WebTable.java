package webdriver;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		WebElement tab = driver.findElement(By.xpath("//table[@class='dataTable']"));
		WebElement tbody = tab.findElement(By.tagName("tbody"));
		List<WebElement> trows = tbody.findElements(By.tagName("tr"));
		for(int i=0;i<trows.size();i++) {
			WebElement row = trows.get(i);
//			String Company = row.getText();
//			System.out.println(Company);
			List<WebElement> tdata = row.findElements(By.tagName("td"));
			//for(int j=0;j<tdata.size();j++) {
			WebElement dat = tdata.get(0);
			String name = dat.getText();
			//System.out.println(name);
			if(name.equals("Bata India")) {
				WebElement data = tdata.get(3);
				String text = data.getText();
				System.err.println(name+""+text);
	}
//			else {
//				continue;
//			}
	}
	}

}
