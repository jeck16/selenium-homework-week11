package Project02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class orangehrm {
    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";

        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Open the url in browser
        driver.get(baseUrl);

        //Maximize browser
        driver.manage().window().maximize();

        //Give implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page Title is: " + title);

        // Get current URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL :  " + currentUrl);

        //Get page source
        String pageSource = driver.getPageSource();
        System.out.println("Page source :  " + pageSource);

        // Enter the email to email field
        driver.findElement(By.name("username")).sendKeys("Sunder ");

        // Enter the password to password field
        driver.findElement(By.name("password")).sendKeys("CEO GOOGLE");

        //Wait for 10 seconds
        Thread.sleep(1000);

        //Close the browser
        driver.close();

    }

}
