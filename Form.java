import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Form {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\brixv\\eclipse-workspace\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		// Navigate to the Website
		driver.get("https://formy-project.herokuapp.com/form");

		// Instantiate FormPage class to create a new object
		FormPage formPage = new FormPage();
		formPage.submitForm(driver);

		// Instantiate ConfirmationPage class to create a new object
		ConfirmationPage confirmationPage = new ConfirmationPage();
		confirmationPage.waitForAlertBanner(driver);

		// Assert the text of the alert - assertEqual(actual, expected)
		Assert.assertEquals(confirmationPage.getAlertBannerText(driver), "The form was successfully submitted!");
		System.out.println(confirmationPage.getAlertBannerText(driver));

		driver.quit();

	}

}
