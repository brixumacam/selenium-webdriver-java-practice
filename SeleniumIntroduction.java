import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		// 1
		
		/**
		 * chromedriver.exe --> will invoke/launch the Chrome Browser
		 * Selenium, internally will look for this key value: ("webdriver.chrome.driver", value of path)
		 * were value of path is where chromedriver is saved in your local machine
		 * 
		 */
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\brixv\\eclipse-workspace\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		// Instantiate ChromeDriver class to access methods in ChromeDriver which are defined in WebDriver interface
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/"); // Load a new webpage
		System.out.println(driver.getTitle());         // Get the title of the website and print it in console
		System.out.println(driver.getCurrentUrl());    // Get the current url opened
		// System.out.println(driver.getPageSource()); // Method that gives the source of the last page loaded
		driver.close();                                // Closes the current window in the browser
		// driver.quit();                              // Closes all associated windows opened by selenium
		
	
		/**
		  // geckodriver --> invoke Firefox browser
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\brixv\\eclipse-workspace\\GeckoDriver\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		  WebDriver driver2 = new FirefoxDriver();
		
		  // msedgedriver --> invoke Microsoft Edge browser
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\brixv\\eclipse-workspace\\MSEdgeDriver\\edgedriver_win64\\msedgedriver.exe");
		  WebDriver driver3 = new EdgeDriver();
		 */
		
		
	}

}

