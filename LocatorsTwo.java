import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LocatorsTwo {

	public static void main(String[] args) throws InterruptedException {
		// 4
		
		String userName = "brixumacam";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\brixv\\eclipse-workspace\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); 
		
		// Go to the Website and maximize window
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		
		// Sign-in
		driver.findElement(By.id("inputUsername")).sendKeys(userName);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
		
		// Locator here is tagname since it has no attributes
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
		// Assert the text value
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		
		// Greet text
		System.out.println(driver.findElement(By.xpath("//div/h2")).getText());
		
		// Assert Greet text value
		Assert.assertEquals(driver.findElement(By.xpath("//div/h2")).getText(), "Hello " + userName + ",");
		
		// Log out
		// driver.findElement(By.xpath("//button[contains(@class, 'logout')]")).click();
		
		// driver.quit();

	}

}
