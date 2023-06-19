package Project01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser_01 {

    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
    static String browser = "Firefox";

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Enter valid browser name");
        }

        //Open the URL
        driver.get(baseUrl);

        // Maximize bro
        driver.manage().window().maximize();

        // Give implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Get the Title of the page
        String title = driver.getTitle();
        System.out.println("Page title is " + title);

        // Get the current url
        String url = driver.getCurrentUrl();
        System.out.println("Current URL " + url);

        // Get page source
        String pageSource = driver.getPageSource();
        System.out.println("Page Source :  " + pageSource);

        // Find the Email field Element
        WebElement emailField = driver.findElement(By.id("Email"));

        // Type the email address to the email field element
        emailField.sendKeys("ankur@gmail.com");

        // Find the password field Element
        driver.findElement(By.name("Password")).sendKeys("abc123");

        //wait for 10 seconds
        Thread.sleep(10000);

        // Close the Browser
        driver.close();
    }
}
