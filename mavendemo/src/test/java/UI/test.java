package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		String tittle = driver.getTitle();
		System.out.print(tittle+ " 1 ");
		String user = "standard_user";
		driver.findElement(By.id("user-name")).sendKeys(user);
		String pass = "secret_sauce";
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("login-button")).click();
		if(user == "standard_user") {
			String tittle1 = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div")).getText();
			System.out.print(tittle1 + " 2 ");
			System.out.print(" Login Berhasil");
		}else{
			String text = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
			System.out.print(text);
			System.out.print(" Login Gagal");
		}
		driver.close();
	}

}
