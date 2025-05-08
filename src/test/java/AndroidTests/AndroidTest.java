//package AndroidTests;
//
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.android.AndroidDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import java.net.MalformedURLException;
//import java.net.URL;
//
//public class AndroidTest {
//    AppiumDriver<MobileElement> driver;
//
//    @BeforeClass
//    public void setUp() throws MalformedURLException {
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("platformVersion", "11.0"); // Adjust as needed
//        capabilities.setCapability("deviceName", "emulator-5554"); // Adjust as needed
//        capabilities.setCapability("appPackage", "com.example.android"); // Replace with your app's package name
//        capabilities.setCapability("appActivity", "com.example.android.MainActivity"); // Replace with your app's main activity
//        capabilities.setCapability("automationName", "UiAutomator2");
//
//        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//    }
//
//    @Test
//    public void testAppLaunch() {
//        // Example action: Click a button and verify the result
//        MobileElement button = driver.findElementById("com.example.android:id/button");
//        button.click();
//
//        // Verify the result
//        MobileElement resultText = driver.findElementById("com.example.android:id/resultText");
//        String result = resultText.getText();
//        Assert.assertEquals(result, "Expected Result");
//    }
//
//    @AfterClass
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//}
