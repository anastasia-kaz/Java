package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public final class BaseUtils {

    private static final ChromeOptions chromeOptions;
    static {
        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-size=1920,1080");
        WebDriverManager.chromedriver().setup();
    }
    static WebDriver createDriver() {
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
    static void get(WebDriver driver) {
        driver.get("https://store.steampowered.com");
    }

}
