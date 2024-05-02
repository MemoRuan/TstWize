package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    protected static ThreadLocal <AppiumDriver> driver = new ThreadLocal<AppiumDriver>();

    public AppiumDriver getDriver() {
        return driver.get();
    }
    public static void setDriver(AppiumDriver driver2) {
        //BaseTest.driver = driver;
        driver.set(driver2);
    }



    @BeforeTest
    public void beforeTest() throws MalformedURLException {
        AppiumDriver driver;
        DesiredCapabilities ds = new DesiredCapabilities();
        ds.setCapability("platformName","Android");
        //ds.setCapability("deviceName","Android");
        ds.setCapability("udid","988e90334956495136");
        ds.setCapability("udid","988e90334956495136");
        ds.setCapability("automationName","uiautomator2");
        ds.setCapability("appPackage","com.swaglabsmobileapp.SplashActivity");
        URL url = new URL("127.0.0.1:4723");
        String appPath = System.getProperty("usr.dir")+"src//test//resources//Android.SauceLabs.Mobile.Sample.app.2.7.1.apk";
        ds.setCapability("app", appPath);
        driver = new AndroidDriver(url, appPath);

    }

    @AfterTest
    public void afterTest(){
        if(getDriver() != null){
            getDriver().quit();
        }

    }

    public void enterText(WebElement e, String txt){
        e.sendKeys();
    }

    public void click(WebElement e){
        e.click();
    }
}
