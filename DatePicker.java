import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\brixv\\eclipse-workspace\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		// Navigate to the Website
		driver.get("https://formy-project.herokuapp.com/datepicker");
		
		// Pick by setting a text
		WebElement dateField = driver.findElement(By.id("datepicker"));
		dateField.sendKeys("03/03/2023");
		dateField.sendKeys(Keys.RETURN);
		Thread.sleep(1000);
		dateField.clear();
		
		// Pick by clicking the date
		dateField.click();
		Thread.sleep(1000);
		WebElement pickedDate = driver.findElement(By.xpath("//td[normalize-space()='23']"));
		pickedDate.click();
		Thread.sleep(1000);
		
		System.out.println("Test Passed!!!");
		driver.quit();

	}

}
