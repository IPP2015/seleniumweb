package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class mavendemo {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "E:\\batch220\\webdriver\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	driver.get("https://www.ebay.com/");
	driver.findElement(By.xpath("//*[@id='gh-ac']")).sendKeys("test");
	driver.findElement(By.id("gh-btn")).click();
//	driver.findElement(By.xpath("(//*[contains(text(),'Forms')])"));
//	driver.findElement(By.xpath("(//*[contains(text(),'Practice Form')])[2]")).click();
//	driver.findElement(By.id("firstName")).sendKeys("ilham");
//	driver.findElement(By.id("lastName")).sendKeys("putra");
//	driver.findElement(By.id("userEmail")).sendKeys("putra");
//	driver.findElement(By.id("submit")).click();
//	driver.getTitle();
	//System.out.println(g)
	driver.close();
	}

}
