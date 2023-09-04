package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class mavendemo {

	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
//	JavascriptExecutor js = (JavascriptExecutor)driver;
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
