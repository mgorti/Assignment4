package Omk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Omk_mentor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omk.herokuapp.com/login");
		driver.findElement(By.id("email")).sendKeys("kishore@mentor.com");
		driver.findElement(By.id("password")).sendKeys("121212");
		driver.findElement(By.xpath(".//*[@id='app']/div/div/div/div/div[2]/form/div[4]/div/button")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.findElement(By.xpath("//a[@href='http://omk.herokuapp.com/mentors']")).click();
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='app']/table/tbody/tr/td[8]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("zip")).clear();
		driver.findElement(By.id("zip")).sendKeys("68116");
		driver.findElement(By.id("phone")).clear();
		driver.findElement(By.id("phone")).sendKeys("4023029055");
		driver.findElement(By.xpath("html/body/div[1]/form/div[7]/input")).click();
		
		
	}

}
