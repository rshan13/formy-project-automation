import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class FileUpload {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rathi\\Selenium\\Chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement chooseFile = driver.findElement(By.id("file-upload-field"));
       // chooseFile.click();
        Thread.sleep(2000);
        chooseFile.sendKeys("C:\\Users\\Rathi\\Dropbox\\PC\\Desktop\\myfile.txt");
        chooseFile.sendKeys(Keys.RETURN);
        Thread.sleep(2000);
        driver.quit();
    }
}
