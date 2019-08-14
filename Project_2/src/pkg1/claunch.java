package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class claunch {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHREYA\\Desktop\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("shreya");
		WebElement password= driver.findElement(By.name("pass"));
		password.sendKeys("kferfgm4564");
		WebElement loginbutton= driver.findElement(By.id("u_0_2"));
		loginbutton.click();
		
System.out.println("Login");
	}


}
