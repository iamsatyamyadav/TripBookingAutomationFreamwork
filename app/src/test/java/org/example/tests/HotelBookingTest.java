package org.example.tests;

import org.example.pages.HotelBookingPage;
import org.example.utils.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HotelBookingTest {
      WebDriver driver;
    HotelBookingPage bookingPage;

    @BeforeClass
    public void setup() {
        driver = DriverFactory.getDriver();
        driver.get("https://your-hotel-booking-site.com"); // Replace with actual URL
        bookingPage = new HotelBookingPage(driver);
    }

    @Test
    public void testCouponDiscountApplication() {
        bookingPage.searchHotel("New York", "April 10", "April 15");
        bookingPage.selectFirstHotel();
        bookingPage.applyCoupon("SUMMER25");

        Assert.assertTrue(bookingPage.isDiscountApplied(), "Discount should be applied.");

        bookingPage.proceedToCheckout();

        // NOTE: Do not complete payment per instructions
    }

    @AfterClass
    public void teardown() {
        DriverFactory.quitDriver();
    }
}
