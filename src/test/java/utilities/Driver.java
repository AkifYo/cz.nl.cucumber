package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    private Driver() {

    }

    static WebDriver driver;

    public static WebDriver getDriver() {
        String browser = ConfigReader.getProperty("browser");
        if (driver == null) {
            switch (browser) {
                case "chrome":
                    System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo X270\\selenium\\chromedriver.exe");
                    ChromeOptions co=new ChromeOptions();
                    co.setBinary("C:\\Users\\Lenovo X270\\Downloads\\chrome-win64 (2)\\chrome-win64\\chrome.exe");
                   // WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(co);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }
    public static void closeDriver(){

        if (driver != null){
            driver.close();
            driver=null;
        }

    }

    public static void quitDriver(){
        if (driver != null){
            driver.quit();
            driver=null;
        }
    }
}
