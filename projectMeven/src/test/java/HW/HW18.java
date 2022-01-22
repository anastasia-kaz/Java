package HW;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.*;

public class HW18 extends BaseTest {

    @Test
    public void TestAnastasiaKazHW18() throws InterruptedException {

        getDriver().get("https://www.webstaurantstore.com");
        WebElement search = getDriver().findElement(By.id("searchval"));
        search.click();
        search.sendKeys("stainless work table\n");

        List<WebElement> tableList = getDriver().findElements(By.xpath("//div[@id='product_listing']//div[@class='details text-center']"));
        Assert.assertTrue(tableList.size()!=0);
        WebElement card = getDriver().findElement(By.xpath("//div[@id='product_listing']//input[@type='submit']"));
        for (WebElement webElement : tableList) {
            Assert.assertTrue(webElement.getText().contains("Table"));
        }

        WebElement tableLast = tableList.get(tableList.size()-1);
        tableLast.findElement(By.xpath("//div[@id='product_listing']//input[@type='submit']")).click();

        WebElement viewCard = getDriver().findElement(By.xpath("//*[@id='watnotif-wrapper']//a"));
        viewCard.click();

        WebElement EmptyCard = getDriver().findElement(By.xpath("//div[@data-hypernova-key='EmptyCart']/a"));
        EmptyCard.click();

        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), 10);
        WebElement buttonEmpty = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='modal-footer']//button[@class='btn btn-primary']")));
        buttonEmpty.click();

        String emptyText = getDriver().findElement(By.xpath("//div[@class='empty-cart__text']/p[@class='header-1']")).getText();
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://www.webstaurantstore.com/viewcart.cfm");
//        Assert.assertEquals(getDriver().findElement(By.xpath("//p[@class='header-1']")).getText(),"Your cart is empty.");

//        WebElement cartItemCountSpan = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='cartItemCountSpan']")));
//        String text = cartItemCountSpan.getText();
//        Assert.assertEquals(text,"0");

//        Assert.assertTrue(getDriver().findElement(By.xpath("//img[@class='cart-image']")).isDisplayed());

//        WebElement b = getDriver().findElement(By.xpath("//a[@class='btn btn-primary']"));
//        b.click();


    }
}

