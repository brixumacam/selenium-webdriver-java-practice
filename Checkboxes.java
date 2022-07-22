import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxes {

	public static void main(String[] args) {
		// 12
		
		/**
		 * TestNG is one of the testing framework which we will be
		 * using to build selenium automation framework
		 * TestNG is an assertion library
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\brixv\\eclipse-workspace\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		// Navigate to the Website
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		// Output the default value of the checkbox
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected()); // false
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected()); // false
		
		// Change to the value of the chekcbox to true
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click(); // true
		
		// Output the changed value of the checkbox
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected()); // true
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected()); // true
		
		// Get and ouput the count of number of checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size()); // 6
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 6);
		
		driver.quit();

	}

}
