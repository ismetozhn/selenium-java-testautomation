import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        String googleTitle = driver.getTitle();
        System.out.println("Google title is : " + googleTitle);

        driver.navigate().to("https://www.udemy.com");
        String udemyTitle = driver.getTitle();
        System.out.println("Udemy title is : " + udemyTitle);

        String udemyUrl = driver.getCurrentUrl();
        System.out.println("Udemy url is : " + udemyUrl);
        driver.navigate().back();
        String googleUrl = driver.getCurrentUrl();
        System.out.println("Google url is : " + googleUrl);

        //driver.manage().window().fullscreen();
        //Thread.sleep(2000);
        driver.navigate().refresh();
        googleUrl = driver.getCurrentUrl();
        System.out.println("Google url is : " + googleUrl);

        driver.navigate().forward();
        udemyUrl = driver.getCurrentUrl();
        System.out.println("Udemy url is : " + udemyUrl);

        //Thread.sleep(3000);
        driver.quit();
    }
}
