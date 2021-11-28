package playground;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
    public WebDriver driver = DriverFactory.getInstance().getDriver();
    @BeforeMethod
    public void browserInitialization() {
        WebDriverManager.chromedriver().setup();
        driver.get("https://phptravels.com/demo/");
    }

    @AfterMethod
    public void closeBrowser() {
        DriverFactory.getInstance().removeDriver();
    }
}
