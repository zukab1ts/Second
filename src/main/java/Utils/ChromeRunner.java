package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class ChromeRunner {
    public static WebDriver driver = new ChromeDriver();

    @BeforeTest (description = "Chrome ბრაუზერის გახსნა")
    public void openChrome() {
        driver.manage().window().maximize();
        driver.get("https://my.cloud9.ge/login?language=english");

    }

    @AfterTest (description = "Chrome ბრაუზერის დახურვა")
    public void closeChrome() {
        driver.close();
    }
}
