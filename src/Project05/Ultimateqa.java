package Project05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Ultimateqa {
    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";

        //Launch the Chrome
        WebDriver driver = new ChromeDriver();

        //Open URL in browser
        driver.get(baseUrl);

        //Maximize Browser
        driver.manage().window().maximize();

        //Give implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Get the Title of the page
        String title = driver.getTitle();
        System.out.println("Page Title : " + title);

        //Get current URL
        String url = driver.getCurrentUrl();
        System.out.println("Current URL :  " + url);

        //Get page source
        String PageSource = driver.getPageSource();
        System.out.println("Page source :  " + PageSource);

        //Enter the email to email field
        driver.findElement(By.name("user[email]")).sendKeys("MUKESH");

        //Enter the password to password field
        driver.findElement(By.name("user[password]")).sendKeys("AMBANI");

        //Wait for 10 seconds
        Thread.sleep(10000);

        //Close the Browser
        driver.close();
    }
}
