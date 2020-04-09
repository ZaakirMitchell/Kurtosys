package SampleTest;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class DriverSetup
{
    File IEDriver;
    File chromeDriver;
    String BrowserType;
    public WebDriver SeleniumDriver;

    public WebDriver GetDriver()
    {
        //Get Chrome Driver
        chromeDriver = new File(System.getProperty("user.dir") + "/src/driver/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver",chromeDriver.getAbsolutePath());
        ChromeOptions options = new ChromeOptions();
        options.setBinary("D:\\Documents\\kurtosys\\src\\Chrome\\Application\\chrome.exe");
        SeleniumDriver = new ChromeDriver(options);

        return SeleniumDriver;
    }

    public void startDriver(String BrowserType)
    {
        System.setProperty("org.apache.commons.logging.Log","org.apache.commons.logging.impl.Jdk14Logger");

        SeleniumDriver = GetDriver();

        SeleniumDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        SeleniumDriver.manage().timeouts().pageLoadTimeout(201, TimeUnit.SECONDS);
        SeleniumDriver.manage().timeouts().setScriptTimeout(1, TimeUnit.SECONDS);
        SeleniumDriver.manage().window().maximize();
    }

    //pause/sleep/ wait for thread
    public void pause(int milisecondsToWait)
    {
        try
        {
            Thread.sleep(milisecondsToWait);
        }
        catch (Exception e)
        {
            System.out.println("Unable to pause for " + milisecondsToWait + " amount of seconds due to error " + e);
        }
    }


}
