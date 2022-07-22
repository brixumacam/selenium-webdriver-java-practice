import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationPage {

	public void waitForAlertBanner(WebDriver driver) {

		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert.alert-success")));

	}

	public String getAlertBannerText(WebDriver driver) {

		return driver.findElement(By.cssSelector(".alert.alert-success")).getText();

	}
	
}
