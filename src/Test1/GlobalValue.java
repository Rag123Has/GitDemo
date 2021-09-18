package Test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValue {

	public static void main(String[] args) throws IOException {
		
		Properties prop= new Properties();
		FileInputStream fis= new FileInputStream("E:\\Online\\selenium\\NgTutorial\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		prop.setProperty("browser", "firefox");
		System.out.println(prop.getProperty("browser"));
		FileOutputStream fo= new FileOutputStream("E:\\Online\\selenium\\NgTutorial\\data.properties");
		prop.store(fo, null);
	}

}
