package HW;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HW16 {

    private WebDriver driver;

    @BeforeMethod
    public void before() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void setDown() {
            driver.quit();
    }

    @Test
    public void findCode(){
        driver.get("https://github.com/SergeiDemyanenko/PlatformaticaQA_03");
        WebElement Code = driver.findElement(By.xpath("//a[@id='code-tab']"));
        Code.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://github.com/SergeiDemyanenko/PlatformaticaQA_03");
    }

    @Test
    public void findIssues(){
        driver.get("https://github.com/SergeiDemyanenko/PlatformaticaQA_03");
        WebElement Issues = driver.findElement(By.xpath("//a[@id='issues-tab']"));
        Issues.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://github.com/SergeiDemyanenko/PlatformaticaQA_03/issues");
    }

    @Test
    public void findPullRequests(){
        driver.get("https://github.com/SergeiDemyanenko/PlatformaticaQA_03");
        WebElement PullRequests = driver.findElement(By.xpath("//a[@id='pull-requests-tab']"));
        PullRequests.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://github.com/SergeiDemyanenko/PlatformaticaQA_03/pulls");
    }

    @Test
    public void findWatch(){
        driver.get("https://github.com/SergeiDemyanenko/PlatformaticaQA_03");
        WebElement Watch = driver.findElement(By.xpath("//a[@class='tooltipped tooltipped-s btn-sm btn']"));
        Watch.click();
        Assert.assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'Sign in to GitHub')]")).isDisplayed());
    }

    @Test
    public void findStar(){
        driver.get("https://github.com/SergeiDemyanenko/PlatformaticaQA_03");
        WebElement Star = driver.findElement(By.xpath("//a[@class='social-count js-social-count']/../a"));
        Star.click();
        Assert.assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'Sign in to GitHub')]")).isDisplayed());
    }

    @Test
    public void findFork(){
        driver.get("https://github.com/SergeiDemyanenko/PlatformaticaQA_03");
        WebElement Fork = driver.findElement(By.xpath("//a[@class='social-count']/../a"));
        Fork.click();
        Assert.assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'Sign in to GitHub')]")).isDisplayed());
    }
}








