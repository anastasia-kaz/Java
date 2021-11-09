import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private static WebDriver driver;
    private WebElement AboutButton = driver.findElement(By.xpath("//a[contains(@href,'https://store.steampowered.com/about/') and @class='menuitem']"));
    private WebElement Online = driver.findElement(By.xpath("//div[contains(@class,'online_stat_label gamers_online')]"));
    private WebElement InGame = driver.findElement(By.xpath("//div[contains(@class,'online_stat_label gamers_in_game')]"));
    private WebElement Store = driver.findElement(By.xpath("//a[@href='https://store.steampowered.com/']"));

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public static String getHomePageTitle() {
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        return pageTitle;
    }
}
