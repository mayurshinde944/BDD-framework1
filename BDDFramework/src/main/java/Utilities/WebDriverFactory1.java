package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverFactory1 {

	public static void main(String[] args) {
		String siteUrl = "https://www.booking.com";

		String browserName = "Chrome";
		WebDriver driver = null;

		if (browserName.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(siteUrl);

		driver.close();

	}

}
