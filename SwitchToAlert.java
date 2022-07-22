import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\brixv\\eclipse-workspace\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		// Navigate to the Website
		driver.get("https://formy-project.herokuapp.com/switch-window");
		
		// driver.switchTo().alert();
		// driver.switchTo().frame("frameName");
		
		// Define a new Web Element
		WebElement alertButton = driver.findElement(By.id("alert-button"));
		alertButton.click(); // this opens the alert
		
		// Use Alert class to define an alert object to be able to switch to that alert
		Alert alert = driver.switchTo().alert();
		Thread.sleep(5000); // to check that it switch to the alert
		alert.accept();
		
		driver.quit();

	}

}
