package webdriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesFile {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\aswin\\eclipse-workspace\\Sample\\src\\test\\resources\\FileName.properties");
		try {
		FileInputStream f1 = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(f1);
		String url = prop.getProperty("url");
		String user = prop.getProperty("username");
		String pass = prop.getProperty("password");
		String env = prop.getProperty("env");
		
		System.out.println(url);
		System.out.println(user);
		System.out.println(pass);
		System.out.println(env);
		
		FileOutputStream f2 = new FileOutputStream(f);
		prop.setProperty("env", "prod");
		prop.setProperty("newKey", "newValue");
		prop.save(f2, "Environment chnaged");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
