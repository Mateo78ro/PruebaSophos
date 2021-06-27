package PruebaChrome;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prueba {

	private WebDriver driver;
	
	 @Before
	 public void inicio() {
		 System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
		 
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 
	 }

	 @Test
	 public void testPage() {
		 
		 WebElement box = driver.findElement(By.name("q"));
		 box.clear();
		 box.sendKeys("Como se crea un repositorio en GitLab");
		 box.submit();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 assertEquals("Como se crea un repositorio en GitLab", driver.getTitle());
		 
	 }
	 
	
}
