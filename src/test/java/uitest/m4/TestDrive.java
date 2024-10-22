package uitest.m4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.Test;

public class TestDrive {

    @Test
    public void test(){
//        SafariOptions options = new SafariOptions();
//        WebDriver driver = new SafariDriver(options);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://uat.trustly.one/merchant-demo/globex/");
        Demohelper.pause();
        driver.quit();
    }
}
