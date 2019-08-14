package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mmtddaction {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHREYA\\Desktop\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.makemytrip.com");
	driver.manage().window().maximize();
	WebElement city1 = driver.findElement(By.id("fromCity"));
	city1.click();
	Actions ac1= new Actions(driver);
	ac1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	WebElement city2= driver.findElement(By.id("toCity"));
	city2.click();
	Actions ac2= new Actions(driver);
	ac2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	
}
}
