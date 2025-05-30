//package UITests;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import java.io.File;
//import org.apache.commons.io.FileUtils;
//
//
//public class shotShotCode {
//    WebDriver driver;
//    @BeforeClass
//    public void setUp() {
//        // Set the path to the ChromeDriver executable
//        System.setProperty("webdriver.chrome.driver", "/Users/shyamjeet/IdeaProjects/APIDEMO_JAVA_RestAssured/Drivers/chromedriver");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        driver = new ChromeDriver(options);
//    }
//
//    @Test
//    public void testScreenshot(){
//        driver.get("https://www.example.com");
//        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(src, new File("screenshot.png"));
//        System.out.println("Screenshot taken successfully.");
//        driver.quit();
//    }
//}
