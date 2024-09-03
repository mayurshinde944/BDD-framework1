 package Utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class AppProperties1 {
	public static void main(String[] args) throws IOException {
	/*	File file = new File("src/main/resources/log4j2.properties");

		FileReader fileReader = new FileReader(file);

		Properties properties = new Properties();

		properties.load(fileReader);

		System.out.println(properties.getProperty("appenders")); */
		
	getProperty("src/test/resources/test.properties", "browser");
	
	BaseClass bs = new BaseClass();
	
	bs.launchSession();
	
	//bs.clearSession();

	}

	public static String getProperty(String filePath, String propertyName ) throws IOException {
		String property = null;
		
		try
		{
			File file = new File(filePath);

			FileReader fileReader = new FileReader(file);

			Properties properties = new Properties();

			properties.load(fileReader);
			
			

			property =properties.getProperty(propertyName);
		}
		
		catch(IOException ex){
			Logs.getLog().getLogger("AppProperties1").error("Error-->"+ex.getMessage());
		}
		if(property != null) {
			Logs.getLog().getLogger("AppProperties1").info("Info--> Sucess Reading Property : "+property);
			
		}
		else
		{
			Logs.getLog().getLogger("AppProperties1").info("Info--> Failure Reading Property : "+property);
		}
		
		return property;

	}

}
