package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web-driver.chrome.driver",
                "E:\\Project_Personal\\Selenium\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://clothing-store-app.netlify.app/");
        driver.manage().window().maximize();
        String myTitle = driver.getTitle();
        String compare = "React App";
        if (!myTitle.equalsIgnoreCase(compare)) {
            System.out.println("Failed - React app title is unmatched");
            driver.quit();
        }
        driver.findElement(By.xpath("//*[text()='SIGN IN']")).click();
        driver.findElement(By.xpath("//*[@class='sc-gKPRtg fgZxjp']//input[@type='email']"))
                .sendKeys("admin@gmail.com");
        driver.findElement(By.xpath("//*[@class='sc-gKPRtg fgZxjp']//input[@type='password']"))
                .sendKeys("Daya100466");
        driver.findElement(By.xpath("//button[text()='Sign In']")).click();
        Thread.sleep(5000);
        boolean myFlag = driver.findElement(By.xpath("//*[text()='SIGN OUT']"))
                .isDisplayed();
        if (myFlag) {
            System.out.println("Passed - User signed in Successfully!");
        } else {
            System.out.println("Failed - Sign In Failed");
            driver.quit();
            System.exit(1);
        }
    }
}
