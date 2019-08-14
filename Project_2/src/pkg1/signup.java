package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class signup {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHREYA\\Desktop\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement firstname= driver.findElement(By.name("firstname"));
	firstname.sendKeys("Shreya");
	WebElement lastname = driver.findElement(By.cssSelector("input#u_0_n"));
	lastname.sendKeys("Singh");
	WebElement mob = driver.findElement(By.id("u_0_q"));
	mob.sendKeys("65678945333");
	WebElement pass= driver.findElement(By.cssSelector("input#u_0_x"));
    pass.sendKeys("thisispassword");
    WebElement date= driver.findElement(By.cssSelector("select[name='birthday_day']"));
    Select s = new Select(date);
    s.selectByIndex(7);
    WebElement month= driver.findElement(By.cssSelector("select#month")); 
    Select s1= new Select(month);
    s1.selectByVisibleText("Dec");
    WebElement year= driver.findElement(By.cssSelector("select#year"));
    Select s2= new Select(year);
    s2.selectByVisibleText("1992");
    WebElement gender= driver.findElement(By.id("u_0_8"));
    gender.click();
    WebElement signup= driver.findElement(By.name("websubmit"));
   
    signup.click();
    System.out.println("Sign up");
     
}

}
