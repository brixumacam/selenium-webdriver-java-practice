import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsOne {

	public static void main(String[] args) throws InterruptedException {
		// 3
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\brixv\\eclipse-workspace\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Implicit Wait - should be declared after calling ChromeDriver
		// Note that this is available for all the elements to wait 2secs until it is located
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); 
		
		// Go to the Website
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		
		// Sign-in using wrong Username and Password
		driver.findElement(By.id("inputUsername")).sendKeys("brixumacam ");
		driver.findElement(By.name("inputPassword")).sendKeys("bettinasanjuan");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector(".error")).getText()); // prints the error message
		
		// Forgot Password
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		
		// Reset Login
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("brixumacam ");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("bettinasanjuan");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("7457568390"); // This xpath uses indexing (parent to child)
		driver.findElement(By.className("reset-pwd-btn")).click();
		
		// Print temporary Password
		System.out.println(driver.findElement(By.className("infoMsg")).getText());
		
		// Go back to login form
		driver.findElement(By.xpath("//button[contains(@class, 'login-btn')]")).click();
		Thread.sleep(1000);
		
		// Sign-in using temporary Username and Password
		driver.findElement(By.xpath("//input[contains(@id, 'inputUsername')]")).sendKeys("rahul"); // This xpath uses contains keyword
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class, 'submit')]")).click();
		
		// driver.quit();
		
	}

}
