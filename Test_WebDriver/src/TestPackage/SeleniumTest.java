package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        String userName = "9480158772";
        String password = "sharudaya";

        System.setProperty("web-driver.chrome.driver",
                "E:\\Project_Personal\\Selenium\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.voot.com/");
        driver.manage().window().maximize();
        String myTitle = driver.getTitle();
        String compare = "VOOT - Watch Free Online TV Shows, Movies, Kids Shows HD Quality on VOOT. Keep Vooting.";
        if (!myTitle.equalsIgnoreCase(compare)) {
            System.out.println("Failed - React app title is unmatched");
            driver.quit();
        }
        driver.findElement(By.xpath("//div[@class='MuiAvatar-root-145 MuiAvatar-colorDefault-146 " +
                        "withRouter-Connect-Component---avatar-121']//img[@alt='User Avatar']"))
                .click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='MuiListItemText-root-164 " +
                        "withRouter-Connect-Component---ListItemText-133']//span[text()='Log In']"))
                .click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//p[text()='Register/Login with Mobile']"))
                .click();
        Thread.sleep(1000);
        driver.findElement(By.id("mobile number"))
                .sendKeys(userName);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Continue']"))
                .click();
        Thread.sleep(1000);
        driver.findElement(By.id("enter password"))
                .sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Continue']"))
                .click();
        Thread.sleep(10000);
        driver.navigate().refresh();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//h2[text()='SHARADA D NAYAK']"))
                .click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//img[@alt='Bigg Boss Kannada']"))
                .click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='interactivityPlayButtonDv']//button[text()='Vote Now']"))
                .click();
        Thread.sleep(15000);

        for (int i = 0; i < 100; i++) {
            driver.findElement(By.xpath("//img[@alt='Roopesh Shetty ']"))
                    .click();
            driver.findElement(By.xpath("//button[text()='Submit']")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//button[text()='Back']")).click();
            Thread.sleep(1000);
            if(i == 99) {
                System.out.println("All done - 100 submissions completed !!!");
            }
        }
//        if(flag.equalsIgnoreCase("passed")) {
//            System.out.println("Passed Test Case");
//        }
//        else {
//            System.out.println("Failed Test Case");
//        }

//        driver.findElement(By.xpath("//*[text()='SIGN IN']")).click();
//        driver.findElement(By.xpath("//*[@class='sc-gKPRtg fgZxjp']//input[@type='email']"))
//                .sendKeys("admin@gmail.com");
//        driver.findElement(By.xpath("//*[@class='sc-gKPRtg fgZxjp']//input[@type='password']"))
//                .sendKeys("Daya100466");
//        driver.findElement(By.xpath("//button[text()='Sign In']")).click();
//        Thread.sleep(5000);
//        boolean myFlag = driver.findElement(By.xpath("//*[text()='SIGN OUT']"))
//                .isDisplayed();
//        if (myFlag) {
//            System.out.println("Passed - User signed in Successfully!");
//        } else {
//            System.out.println("Failed - Sign In Failed");
//            driver.quit();
//            System.exit(1);
//        }
    }
}
