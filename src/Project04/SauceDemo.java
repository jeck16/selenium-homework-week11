package Project04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SauceDemo {

    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://www.saucedemo.com/";

        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();

        //Open the Url un browser
        driver.get(baseUrl);

        //Maximize Browser
        driver.manage().window().maximize();

        //we give implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Get the title of the page
        String Title = driver.getTitle();
        System.out.println(" Page Title is :  " + Title);

        //Get current URL
        String CurrentUrl = driver.getCurrentUrl();
        System.out.println(" Current URL : " + CurrentUrl);

        //Get page source
        String pageSource = driver.getPageSource();
        System.out.println("Page source " + pageSource);

        //Enter the email to email field
        driver.findElement(By.id("user-name")).sendKeys("MODI");

        //Enter the password to password field
        driver.findElement(By.id("password")).sendKeys("NAREDRA");

        //Wait for 10 seconds
        Thread.sleep(10000);

        //Close the Browser
        driver.close();
    }
}
