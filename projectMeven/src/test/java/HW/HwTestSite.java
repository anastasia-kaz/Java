package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.Key;
import java.util.concurrent.TimeUnit;

public class HwTestSite {
    @Test
    public void testLoginError()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.get("https://www.google.com");

            WebElement search = driver.findElement(By.name("q"));
            search.click();
            search.sendKeys("онлайнер");
            search.submit();

            WebElement link = driver.findElement(By.xpath("//div[@class='TbwUpd NJjxre']/cite[@class='iUh30 Zu0yb tjvcx']"));
            link.click();
            WebElement link1 = driver.findElement(By.xpath("//*[@id='container']//section/ol/li[1]/a"));
            link1.click();

            WebElement search1 = driver.findElement(By.xpath("//*[@id='search_keywords']"));
            search1.sendKeys("доллар");
            search1.submit();

            WebElement result = driver.findElement(By.xpath("//*[@id='minWidth']//h1/a"));
            String results = result.getText();
            Assert.assertEquals(results, "Обсуждение курсов валют. Часть 5.");
        } finally {
            driver.quit();
        }
    }}
//    @Test
//    public void testNewPassword() {
//        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
//
//        WebDriver driver = new ChromeDriver();
//        try {
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            driver.manage().window().maximize();
//
//            driver.get("https://www.browserstack.com/users/sign_in");
//
//            WebElement link = driver.findElement(By.linkText("Forgot password?"));
//            link.click();
//
//            Assert.assertEquals(driver.getCurrentUrl(), "https://www.browserstack.com/users/password/new");
//        } finally {
//            driver.quit();
//        }
//    }
//
//}

//    WebElement password = driver.findElement(By.xpath("/html/body/main/div[4]/section/form/div[1]/div/div[1]/div[5]/div/input"));
//    WebElement login = driver.findElement(By.name("commit"));
//
//            username.sendKeys("abcd@gmail.com");
//                    password.sendKeys("your_password");
//                    login.click();
//
//                    WebElement error = driver.findElement(By.id("bs-alert-text-id"));