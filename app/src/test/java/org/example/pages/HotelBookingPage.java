package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelBookingPage {
    
      WebDriver driver;

    public HotelBookingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "searchBox")
    WebElement searchInput;

    @FindBy(id = "searchButton")
    WebElement searchButton;

    @FindBy(css = ".hotel-card:first-child .select-button")
    WebElement firstHotelSelectButton;

    @FindBy(id = "couponInput")
    WebElement couponInput;

    @FindBy(id = "applyCouponBtn")
    WebElement applyCouponBtn;

    @FindBy(id = "discountAmount")
    WebElement discountAmount;

    @FindBy(id = "checkoutBtn")
    WebElement checkoutButton;

    public void searchHotel(String city, String fromDate, String toDate) {
        searchInput.clear();
        searchInput.sendKeys(city + " " + fromDate + " to " + toDate);
        searchButton.click();
    }

    public void selectFirstHotel() {
        firstHotelSelectButton.click();
    }

    public void applyCoupon(String code) {
        couponInput.clear();
        couponInput.sendKeys(code);
        applyCouponBtn.click();
    }

    public boolean isDiscountApplied() {
        return discountAmount.isDisplayed();
    }

    public void proceedToCheckout() {
        checkoutButton.click();
    }
}
