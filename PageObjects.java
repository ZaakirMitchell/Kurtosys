package SampleTest;

public class PageObjects
{
    //Url Link
    public static String PageUrl() {return  "https://am.jpmorgan.com/gb/en/asset-management/gim/adv/home";}

    //Accept disclaimer button
    public static String DisclaimerBtnXpath() {return "//div[text()='Accept Disclaimer']";}

    //View our feature funds button
    public static String ViewFeaturebtnXpath() {return "//a[text()='VIEW OUR FEATURED FUNDS']";}

    //Find out more link under JPM UK Dynamic Fund
    public static String FindMoreLinkUnderHeader() {return "//div[text()='JPM UK Dynamic Fund']//../../../../..//a";}

    //Jump to a Fund search box
    //public static String JumpToAFundSearchBox() {return "//div[@id='jump-to-fund-placehoder'][1]";}
    public static String JumpToAFundSearchBox() {return "//*[@id=\"searchbox\"]";}

    //Select option from the list
    public static String SelectOptionFromList() {return "//a//span[text()='GB0009698001']";}

    //ISIN value
    public static String IsinValueXpath() {return "//div[@data-testid='overview-side-column'][2]//span[@data-testid='isin']";}

    //Performance and Fees link
    public static String PerformanceLinkXpath() {return "//li[2]/a[@data-tab-name='performance']";}

    //Header for Growth of hypothetical investment
    public static String HeaderforGrowthGraph() {return "//li[2]/a[@data-tab-name='performance']";}



}
