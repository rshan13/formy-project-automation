import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import static java.lang.Thread.*;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rathi\\Selenium\\Chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropdwn= driver.findElement(By.id("dropdownMenuButton"));
        dropdwn.click();
        Thread.sleep(2000);

        WebElement chkbox =  driver.findElement(By.linkText("Checkbox"));
        chkbox.click();
        Thread.sleep(2000);


        driver.quit();
    }
}
