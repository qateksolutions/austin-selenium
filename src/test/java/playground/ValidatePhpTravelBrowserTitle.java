package playground;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidatePhpTravelBrowserTitle extends BaseClass {

    @Test
    public void verifyHomePageTitle() {
        String expectedTitle = "Demo Script Test drive - PHPTRAVELS";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

}
