import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomateBrowsers {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
    }
}
