import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Datepicker {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rathi\\Selenium\\Chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement datepick = driver.findElement(By.id("datepicker"));
        datepick.sendKeys("10/29/2021");
       // datepick.click();
        datepick.sendKeys(Keys.RETURN);
        Thread.sleep(2000);
        driver.quit();
    }
}