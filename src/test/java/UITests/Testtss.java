package UITests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Testtss {


    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();

        // Replace with your Mac profile path
        options.addArguments("user-data-dir=/Users/shyamjeet/Library/Application Support/Google/Chrome");
        options.addArguments("profile-directory=Profile 1");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.linkedin.com/feed/");
    }


}
