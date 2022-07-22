import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FormPage {

	public void submitForm(WebDriver driver) {

		// First Name field
		driver.findElement(By.id("first-name")).sendKeys("Brix");

		// Last Name field
		driver.findElement(By.id("last-name")).sendKeys("Umacam");

		// Job Title field
		driver.findElement(By.id("job-title")).sendKeys("QA Automation Engineer");

		// High level of Education field
		driver.findElement(By.id("radio-button-2")).click();

		// Sex/Gender field
		driver.findElement(By.id("checkbox-1")).click();

		// Years of Experience field
		driver.findElement(By.cssSelector("option[value='1']")).click();

		// Date field
		driver.findElement(By.id("datepicker")).sendKeys("07/24/2023");
		driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

		// Create a new web element for submit button
		WebElement submitButton = driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary"));
		Actions actions = new Actions(driver); // Instantiate the Actions class to use moveToElement
		actions.moveToElement(submitButton); // uses moveToElement to scroll down to the element
		submitButton.click();

	}
	
}
