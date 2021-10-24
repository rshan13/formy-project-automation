import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rathi\\Selenium\\Chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        WebElement FirstName = driver.findElement(By.id("first-name"));
        FirstName.sendKeys("Rat");
       // FirstName.sendKeys(Keys.TAB);

        WebElement LastName = driver.findElement(By.id("last-name"));
        LastName.sendKeys("Sah");
       // LastName.sendKeys(Keys.TAB);

        WebElement JobTitle = driver.findElement(By.id("job-title"));
        JobTitle.sendKeys("QA Engi");
       // JobTitle.sendKeys(Keys.TAB);

        driver.findElement(By.id("radio-button-3")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("checkbox-1")).click();

        driver.findElement(By.cssSelector("option[value='3']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("11/25/2021");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        Thread.sleep(5000);
        driver.quit();
    }
}
