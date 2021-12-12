package playground;

import automation_test.mortgage_calculator.BaseClassUITests;
import command_providers.ActOn;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.RetryFailedTests;

public class ExecuteTests extends BaseClassUITests {
    @Test(retryAnalyzer = RetryFailedTests.class)
    public void run() {
//        ActOn.browser(driver).openBrowser("https://www.mortgagecalculator.org/");
//        Assert.assertEquals(ActOn.browser(driver).captureTitle(), "Mortgage Calculator1");
        driver.get("https://www.mortgagecalculator.org/");
        Assert.assertEquals(driver.getTitle(), "Mortgage Calculator1");
    }
}
