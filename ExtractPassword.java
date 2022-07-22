import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ExtractPassword {

	public static void main(String[] args) throws InterruptedException {
		// 5
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\brixv\\eclipse-workspace\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); 
		
		String extractedPass = getTempPass(driver);
		String userName = "brixumacam";
		
		//Go back to Login Page
		driver.findElement(By.xpath("//button[contains(@class, 'login-btn')]")).click();
		Thread.sleep(1000);
		
		// Sign-in using wrong Username and Password
		driver.findElement(By.id("inputUsername")).sendKeys(userName);
		driver.findElement(By.name("inputPassword")).sendKeys(extractedPass);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
		
		// Print Greeting text
		System.out.println(driver.findElement(By.xpath("//div/h2")).getText());
		// Assert Greeting text value
		Assert.assertEquals(driver.findElement(By.xpath("//div/h2")).getText(), "Hello " + userName + ",");
		
		// Locator here is tagname since it has no attributes
		System.out.println(driver.findElement(By.tagName("p")).getText());
		// Assert the text value
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		
		// Log out
		// driver.findElement(By.xpath("//button[contains(@class, 'logout')]")).click();
		
		// driver.quit();

	}
	
	public static String getTempPass(WebDriver driver) throws InterruptedException {
		
		// Go to the Website
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		
		// Click Forgot Password link text
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		
		// Click Reset button to appear temporary password
		driver.findElement(By.className("reset-pwd-btn")).click();
		String tempPass = driver.findElement(By.className("infoMsg")).getText();
		
		// Please use temporary password 'rahulshettyacademy' to Login.
		String[] arr1 = tempPass.split("'");
		// 0 index = Please use temporary password
		// 1 index = rahulshettyacademy' to Login.
		String[] arr2 = arr1[1].split("'");
		// 0 index = rahulshettyacademy
		// 1 index =  to Login.
		return arr2[0];
		
	}

}
