package Omk;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Omk_staff {

			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("http://omk.herokuapp.com/login");
				driver.findElement(By.id("email")).sendKeys("kishore@staff.com");
				driver.findElement(By.id("password")).sendKeys("121212");
				driver.findElement(By.xpath(".//*[@id='app']/div/div/div/div/div[2]/form/div[4]/div/button")).click();
				driver.findElement(By.xpath("//a[@href='http://omk.herokuapp.com/staffs']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(".//*[@id='app']/h2/a[3]")).click();
				driver.findElement(By.xpath(".//*[@id='app']/a")).click();
				Select dropdown = new Select(driver.findElement(By.name("id")));//Dropdown Declaration//
				dropdown.selectByValue("3");
				driver.findElement(By.id("mentor_name")).sendKeys("Karthik");
				driver.findElement(By.id("student_name")).sendKeys("Kishore");
				driver.findElement(By.id("date")).sendKeys("2017-04-06");
				driver.findElement(By.id("time")).sendKeys("23:49:22");
				driver.findElement(By.id("location")).sendKeys("Omaha");
				Thread.sleep(3000);
				driver.findElement(By.xpath("html/body/div[1]/form/div[7]/input")).click();
				
			}

	}
