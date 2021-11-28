package playground;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateKayakBrowserTitle extends BaseClass{

    @Test
    public void verifyHomePageTitle() {
        String expectedTitle = "KAYAK - Cheap Flights, Hotels, Airline Tickets, Cheap Tickets, Cheap Travel Deals - Compare Hundreds of Travel Sites At Once";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
