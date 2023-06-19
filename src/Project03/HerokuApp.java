package Project03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HerokuApp {
    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://the-internet.herokuapp.com/login";

        // Launch the Chrome
        WebDriver driver = new ChromeDriver();

        //Open the Url into browser
        driver.get(baseUrl);

        // Maximize the browser
        driver.manage().window().maximize();

        //we give implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Get the Title of the page
        String title = driver.getTitle();
        System.out.println("Page Title is :  " + title);

        // Get current URL
        String CurrentUrl = driver.getCurrentUrl();

        //Get page Source
        String pageSource = driver.getPageSource();

        // Enter the email to email field
        driver.findElement(By.name("username")).sendKeys("Mark");

        //  Enter the password to password field
        driver.findElement(By.name("password")).sendKeys("FACEBOOK CE0");

        //Wait for 10 seconds
        Thread.sleep(10000);

        // Close the Browser
        driver.close();
    }

}
