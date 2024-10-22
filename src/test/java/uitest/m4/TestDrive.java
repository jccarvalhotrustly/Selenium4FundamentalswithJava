package uitest.m4;

import helper.Demohelper;
import helper.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static helper.Pages.ENV;

public class TestDrive {

    @Test
    public void test(){
        WebDriver driver = DriverFactory.newDriver();
        driver.get(ENV);
        driver.findElement()
                //Introducing webbriver 4
        driver.quit();
    }
}
