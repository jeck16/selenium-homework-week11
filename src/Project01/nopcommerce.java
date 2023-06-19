package Project01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class nopcommerce {
    public static void main(String[] args) throws InterruptedException {

        // Open URL
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";

        // Setup Chrome browser
        WebDriver driver = new ChromeDriver();

        //Open URL
        driver.get(baseUrl);

        // Maximise Browser
        driver.manage().window().maximize();

        // Implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Print the title of the page
        String title = driver.getTitle();
        System.out.println(" Page Title is " + title);

        // Print current URL
        String url = driver.getCurrentUrl();
        System.out.println("Current url " + url);

        //Print the page source
        String pageSource = driver.getPageSource();
        System.out.println("Page source" + pageSource);

        //Enter the email to email field
        WebElement email = driver.findElement(By.id("Email"));
        // Type email
        email.sendKeys("ankur@gmail.com");

        //Enter the password to password field
        driver.findElement(By.id("Password")).sendKeys("ankur");

        //Wait for 10  seconds
        Thread.sleep(1000);

        // Close the browse
        driver.close();
    }
}


