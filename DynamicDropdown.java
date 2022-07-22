import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// 10
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\brixv\\eclipse-workspace\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		// Navigate to the Practice Page
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		// Dynamic Dropdown
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click(); // Bengluru
		Thread.sleep(1000);
		// driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); // Chennai
		
		// selects chennai that avoid index --> this is called Parent-Child relationship
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		System.out.println("Test Passed!");
		
		// driver.quit();

	}

}
