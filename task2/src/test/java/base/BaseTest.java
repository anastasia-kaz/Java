package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    private WebDriver driver;
    private WebDriverWait wait;
    protected WebDriver getDriver() {
        return driver;
    }
    protected WebDriverWait getWait() {
        if (wait == null) {
            wait = new WebDriverWait(driver, 10);
        }
        return wait;
    }

    @BeforeMethod
    protected void beforeMethod(Method method) {
        driver = BaseUtils.createDriver();
        BaseUtils.get(driver);
        WebDriverManager.chromedriver().setup();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterMethod
    protected void afterMethod(Method method) {
        driver.quit();
    }
}
