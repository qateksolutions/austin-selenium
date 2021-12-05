package automation_test.mortgage_calculator;

import org.testng.annotations.Test;
import page_objects.NavigationBar;

public class CalculateRealAprRate extends BaseClassUITests {
    @Test
    public void calculateRealApr() {
        new NavigationBar(driver)
                .mouseHoverToRates()
                .navigateToRealApr()
                .waitForPageToLoad()
                .typeHomePrice("200000")
                .clickDownPaymentInDollar()
                .typeDownPayment("15000")
                .typeInterestRate("3")
                .clickOnCalculateButton()
                .validateRealAprRate("3.130%");
    }
}
