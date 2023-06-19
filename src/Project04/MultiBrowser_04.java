package Project04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Scanner;

public class MultiBrowser_04 {
    static String baseUrl = "https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Chrome Browser.\nEnter 2 for Edge Browser.\nEnter 3 for Firefox Browser.");
        System.out.println("Enter Number :  ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                driver = new ChromeDriver();
            case 2:
                driver = new EdgeDriver();
            case 3:
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Enter valid number. ");
        }

        //Open Url in Browser
        driver.get(baseUrl);

        //Maximize browser
        driver.manage().window().maximize();

        //Give implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Get the Title of the page
        String Title = driver.getTitle();
        System.out.println("Page Title is " + Title);

        // Get current URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL :  " + currentUrl);

        //Get page source
        String PageSource = driver.getPageSource();
        System.out.println("Page source : " + PageSource);

        //Enter the email to email field
        driver.findElement(By.id("user-name")).sendKeys("RATAN");

        //Enter the password to password field
        driver.findElement(By.id("password")).sendKeys("TATA TECH");

        ///Wait for 10 seconds
        Thread.sleep(10000);

        //Close Browser
        driver.close();

    }


}

