package webdriver;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RealmeMobiles { 
	public static void main(String[] args) throws IOException {
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\aswin\\eclipse-workspace\\Sample\\target\\driver\\msedgedriver.exe");
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.flipkart.com/search?q=redmi+5g+mobile&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_2_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_2_na_na_na&as-pos=1&as-type=RECENT&suggestionId=redmi+5g+mobile%7CMobiles&requestId=5f818e58-22f3-496d-b1ad-782fd9240748&as-backfill=on");
		
		
		List<WebElement> mobileName = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		//System.out.println("Number of mobile names found: " + mobileName.size());
		List<WebElement> mobilePrice = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
		//System.out.println("Number of mobile Prices found: " + mobilePrice.size());
		
		File f = new File("C:\\Users\\aswin\\eclipse-workspace\\Sample\\target\\Flipkart.xlsx");
		
		try{
			FileOutputStream f1 = new FileOutputStream(f);
		
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("Redmi Mobiles");
		
		XSSFRow headerrow =sheet.createRow(0);
		headerrow.createCell(0).setCellValue("Mobile Name");
		headerrow.createCell(1).setCellValue("Mobile Price");
		
		int rowNum=1;
		for(int i=0;i<mobileName.size();i++) {
			WebElement w1 = mobileName.get(i);
			String s1 = w1.getText();
		
		
		for(int j=0;j<mobilePrice.size();j++) {
			WebElement w2 = mobilePrice.get(j);
			String s2 = w2.getText();
		
		XSSFRow row = sheet.createRow(rowNum++);
		row.createCell(0).setCellValue(s1);
		row.createCell(1).setCellValue(s2);
		
		System.out.println("Mobile Name: " + s1);
	    System.out.println("Mobile Price: " + s2);
		}
		}
		book.write(f1);
		f1.close();
		
		}
		catch(Exception e) {
			
		}
		
		
		
		}}


