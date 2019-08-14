package pkg1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHREYA\\Desktop\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		Actions ac= new Actions(driver);
		ac.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
		
		
	}

}
