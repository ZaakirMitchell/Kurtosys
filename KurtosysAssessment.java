package SampleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.sql.SQLOutput;

public class KurtosysAssessment
{

    File IEDriver;
    File chromeDriver;
    String BrowserType;


    public static void main(String[] args) throws InterruptedException
    {

        String FundRef = "GB0009698001";
        String Isin, Graphheader;

        //Initialise the DriverSetup class
        DriverSetup driverSetup = new DriverSetup();

        //Start the drive
        driverSetup.startDriver("Chrome");

        WebDriver SeleniumWebDriver = driverSetup.SeleniumDriver;

        //Navigate to URL
        SeleniumWebDriver.navigate().to(PageObjects.PageUrl());
        System.out.println("Successfully navigated to the web page: " + PageObjects.PageUrl());

        //Accepts the Disclaimer button
        if (SeleniumWebDriver.findElement(By.xpath(PageObjects.DisclaimerBtnXpath())).isDisplayed())
        {
            driverSetup.pause(2000);
            SeleniumWebDriver.findElement(By.xpath(PageObjects.DisclaimerBtnXpath())).click();
            System.out.println("Successfully Accepts the Disclaimer and proceeds to website");
        }
        else
        {
            System.out.println("Unable to find element");
        }

        //Click View Our Feature Funds
        if (SeleniumWebDriver.findElement(By.xpath(PageObjects.ViewFeaturebtnXpath())).isDisplayed()) {
            driverSetup.pause(2000);
            SeleniumWebDriver.findElement(By.xpath(PageObjects.ViewFeaturebtnXpath())).click();
            System.out.println("Succeessully clicks the View Our Feature Funds");
        }
        else
        {
            System.out.println("Unable to find element");
        }

        //Click Find out more from JPM UK Dynamic Fund
        if (SeleniumWebDriver.findElement(By.xpath(PageObjects.FindMoreLinkUnderHeader())).isDisplayed()) {
            driverSetup.pause(2000);
            SeleniumWebDriver.findElement(By.xpath(PageObjects.FindMoreLinkUnderHeader())).click();
            System.out.println("Successfully clicks the find out more link");
        }
        else
        {
            System.out.println("Unable to find element");
        }


        //Enters the fund to in the search box
        driverSetup.pause(7000);
        if (SeleniumWebDriver.findElement(By.xpath(PageObjects.JumpToAFundSearchBox())).isDisplayed()) {
            SeleniumWebDriver.findElement(By.xpath(PageObjects.JumpToAFundSearchBox())).sendKeys(FundRef);
            System.out.println("Successfully searched for fund: " + FundRef );
        }
        else
        {
            System.out.println("Unable to find element");
        }

        //Selects option from the list
        if (SeleniumWebDriver.findElement(By.xpath(PageObjects.SelectOptionFromList())).isDisplayed()) {
            driverSetup.pause(5000);
            SeleniumWebDriver.findElement(By.xpath(PageObjects.SelectOptionFromList())).click();
            System.out.println("Successfully selects the fund from the list");
        }
        else
        {
            System.out.println("Unable to find element");
        }


        if (SeleniumWebDriver.findElement(By.xpath(PageObjects.IsinValueXpath())).isDisplayed()) {
            driverSetup.pause(2000);
            //Retrieve the ISIN number
            Isin = SeleniumWebDriver.findElement(By.xpath(PageObjects.IsinValueXpath())).getText();

            //Verify ISIN is equal to Fund Ref
            if (Isin.equals(FundRef))
            {
                System.out.println("Successfully validated that the ISIN: " + Isin + " is the same as the Fund Ref: " + FundRef);
            }
            else
            {
                System.err.println("Failed Validation of ISIN: " + Isin + " and Fund Ref: " + FundRef);
            }
        }
        else
        {
            System.out.println("Unable to find element");
        }

        //Click Perfomance and Fees tab
        if (SeleniumWebDriver.findElement(By.xpath(PageObjects.PerformanceLinkXpath())).isDisplayed()) {
            driverSetup.pause(2000);
            SeleniumWebDriver.findElement(By.xpath(PageObjects.PerformanceLinkXpath())).click();
            System.out.println("Successfully clicks performance tab");
        }
        else
        {
            System.out.println("Unable to find element");
        }

        //Validation of Graph
        if (SeleniumWebDriver.findElement(By.xpath(PageObjects.HeaderforGrowthGraph())).isDisplayed())
        {
            System.out.println("Successfully validates that the graph is displayed");
        }
        else
        {
            System.err.println("Failed to validate that the graph is displayed");
        }



    }


}
