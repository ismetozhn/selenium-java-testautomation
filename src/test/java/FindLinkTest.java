import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinkTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.partialLinkText("JavaScript onload")).click();
        Thread.sleep(2000);
        driver.navigate().back();

        driver.findElement(By.linkText("Form Authentication")).click();

        Thread.sleep(2000);
        driver.quit();
    }
}
