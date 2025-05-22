# 🧪 Hotel Booking Automation - QA Assessment

This repository contains a Selenium automation script written in Java as part of a **Senior QA and Automation Engineer Assessment**.

---

## 📌 Assignment Scenario

Automated test case for the following scenario:

1. Open the hotel booking application.
2. Search for hotels in “New York” from April 10 to April 15.
3. Select the first hotel from the search results.
4. Apply the coupon code `SUMMER25`.
5. Verify that the discount is applied correctly.
6. Proceed to checkout (without completing payment).

---

## 🛠 Tech Stack

- **Language**: Java 11+
- **Testing Framework**: TestNG
- **Browser Automation**: Selenium WebDriver
- **Design Pattern**: Page Object Model (POM)
- **Driver Management**: ChromeDriver (or WebDriverManager)
- **Build Tool**: Gradle 

---

## 📁 Project Structure

Test.org.example/</br>
                ├── pages/</br>
                │ └── HotelBookingPage.java # Page Object class</br>
                ├── tests/</br>
                │ └── HotelBookingTest.java # Test class</br>
                └── utils/</br>
                └── DriverFactory.java # Driver setup and teardown</br>



---

## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/iamsatyamyadav/TripBookingAutomationFreamwork
   
   cd TripBookingAutomationFreamwork
   
   ./gradlew run

   
