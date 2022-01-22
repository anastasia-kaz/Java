/*import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor)driver;//для возможности переключения между окнами

        driver.get("https://new.artstick.by");

        //не явное ожидание всегда будет ожидать появление элемента
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//старый способ
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//новый способ
        //явное ожидание задается для конкретного элемента в месте где надо остановиться
        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10)))//создаем ожидание и задаем время в секундах
                .until(ExpectedConditions.presenceOfElementLocated(By.id("123")));//условие появления ожидания ждем какое то событие
        //слип не ждет событие просто останавливает драйвер
        Thread.sleep(2000); //слип на 2 секунды считается в миллисекундах

        //создаем ожидание
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("id")));

        //события
        Actions actions = new Actions(driver);
        actions
                .click()
                .doubleClick()
                .keyDown()
                .keyUp()
                .moveToElement()
                .pause()
                .dragAndDrop()
                .release() //обязательный
                .build()   //обязательный
                .perform();//обязательный

        //ожидание появления алерта и принятие его
        element.click(); //клик на ссылку которая вызывает алерт
        Alert alert = wait.until(alertIsPresent());
        alert.accept();

        //промт ввести в алерт и отправить
        element.click();
        Alert promt = wait.until(alertIsPresent()); //ожидаем появления окна ввода
        promt.sendKeys("текст который вводим");
        promt.accept();

        Alert alert2 = wait.until(alertIsPresent());//ожидаем появления алерта после ввода текста
        alert2.accept();

        //алерт в котором можно принять или отменить
        Alert alert3 = wait.until(alertIsPresent());
        alert3.dismiss(); //отклонить алерт


        try {
            driver.get("https://new.artstick.by");
            Thread.sleep(5000);

            String win1 = driver.getWindowHandle();//записываем название окна в переменную

            js.executeScript("window.open()");//с помощью js открываем новое окно

            Set <String> currentWindows = driver.getWindowHandles();//в неупорядоченный список записываем название всех открытых окон

            String win2 = null;//объявляем переменную для второго окна
            for(String window : currentWindows){         //условие цикла
                if (!window.equals(win1)){             //сравнение переменных
                    win2 = window;                    //записываем во вторую переменную название
                    break;                              //останавливаем цикл
                }
            }

            driver.switchTo().window(win2); //переключение на вторую вкладку
            driver.get("https://new.artstick.by/2");       //переход по ссылке
            driver.close();            // закрытие второй вкладки
            driver.switchTo().window(win1);     // переключение на первую, обязательно иначе будет ошибка тк вторая вкладка закрыта


        }catch (InterruptedException e){     //обработка исключений и ошибок
            e.printStackTrace();
        }finally {            // закрытие браузера
            driver.quit();
        }

















        WebElement search = driver.findElement(By.className("header__search"));
        search.click();
        driver.quit();


    }
}
*/