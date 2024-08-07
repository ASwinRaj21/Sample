package webdriver;

public class Sample extends Reusable {
	public static void main(String[] args) throws InterruptedException {
		 webDriv("https://www.facebook.com/");
		 
		 max();
		 
		 findele("//input[@id='email']","Aswin");
		 
		 pageTitle();
		 
		 currentUrl();
		 
		 findeles("a");
		 
		 getAtt("//input[@id='email']","value");
		 sleep();
		 display("pass","123asd");
		 
		 enable("Log in");
		 
		newTab("https://demoqa.com/radio-button");
		
		select("//label[@for='impressiveRadio']");
		sleep();
		close();
		sleep();
		quit();
		 
		 
		 }
	

}
