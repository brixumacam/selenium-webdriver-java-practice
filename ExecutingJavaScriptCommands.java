import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecutingJavaScriptCommands {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\brixv\\eclipse-workspace\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		// Navigate to the Website
		driver.get("https://formy-project.herokuapp.com/modal");
		
		// click modal button to appear modal
		WebElement modalButton = driver.findElement(By.id("modal-button"));
		modalButton.click();
		
		Thread.sleep(3000); // pause to see if it will click the close button
		WebElement closeButton = driver.findElement(By.id("close-button"));
		
		// To click Close button in modal, use JavaScript Executor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", closeButton);
		
		System.out.println("Test Passed!!!");
		
		driver.quit();

	}

}
