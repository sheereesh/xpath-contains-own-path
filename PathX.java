package pathsX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PathX {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://crossbrowsertesting.github.io/");
		driver.findElement(By.xpath("//a[contains(text(),'Selenium Example Page')]")).click();
		driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[text()='Show Message']")).click();
       // driver.findElement(By.xpath("//button[@type='button' and @id='btn']")).click(); 
	}

}
