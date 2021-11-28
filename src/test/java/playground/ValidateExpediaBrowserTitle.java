package playground;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateExpediaBrowserTitle extends BaseClass {

    @Test
    public void verifyHomePageTitle() {
        String expectedTitle = "Expedia Travel: Vacation Homes, Hotels, Car Rentals, Flights & More";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
