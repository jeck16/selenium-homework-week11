package Project05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Scanner;

public class MultiBrowser_05 {

    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Chrome Browser.\nEnter 2 for Firefox Browser.\nEnter 3 for Edge Browser.");
        System.out.println("Enter Number :  ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                driver = new ChromeDriver();
                break;
            case 2:
                driver = new FirefoxDriver();
                break;
            case 3:
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Enter valid number. ");
        }

        //Open the Url in Browser
        driver.get(baseUrl);

        //Maximize browser
        driver.manage().window().maximize();

        //Give implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get Title of the page
        String title = driver.getTitle();
        System.out.println("Page Title is :  " + title);

        // Get current URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL : " + currentUrl);

        //Get page source
        String PageSource = driver.getPageSource();
        System.out.println("Page source : " + PageSource);

        //Enter the email to email field
        driver.findElement(By.id("user[email]")).sendKeys("Prime");

        //Enter the password to password field
        driver.findElement(By.id("user[password]")).sendKeys("THE BEST");

        //Wait for 10 seconds
        Thread.sleep(10000);

        //Close Browser
        driver.close();

    }

}
