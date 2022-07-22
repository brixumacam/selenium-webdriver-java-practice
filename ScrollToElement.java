import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\brixv\\eclipse-workspace\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		// Navigate to the Website
		driver.get("https://formy-project.herokuapp.com/scroll");
		
		// Define a new Web Element
		WebElement name = driver.findElement(By.id("name"));
		// Use Actions class to create a new instance of Actions class
		Actions actions = new Actions(driver);
		actions.moveToElement(name); // moveToElement used to scroll down the element 'name'
		name.sendKeys("Brix Umacam"); // type in the name
		
		// Define a new web element called date
		WebElement date = driver.findElement(By.id("date"));
		date.sendKeys("01/01/2020"); // type in the date
		
		System.out.println("Test Passed!!!");
		driver.quit();

	}

}
