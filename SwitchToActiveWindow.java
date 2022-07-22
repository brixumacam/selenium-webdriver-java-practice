import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\brixv\\eclipse-workspace\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		// Navigate to the Website
		driver.get("https://formy-project.herokuapp.com/switch-window");
		
		// SYNTAX : driver.switchTo().window("windowName");
		
		// Create a new WebElement for button
		WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
		newTabButton.click();
		
		// Declare a variable to hold the original window
		String originalWindow = driver.getWindowHandle();
		
		// Switch to new window using for loop
		for(String secondWindow: driver.getWindowHandles()) {
			driver.switchTo().window(secondWindow);
			Thread.sleep(5000); // to check if it switch to the new window
		}
		
		// Go back to the original window
		driver.switchTo().window(originalWindow);
		
		driver.quit();

	}

}
