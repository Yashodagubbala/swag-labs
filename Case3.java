package testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;// code is not clear
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
public class Case3 {
@Test
public static void SolutionCiCd()	{
       WebDriver driver;
      driver = new FirefoxDriver();
      driver.get("https://docs.saucelabs.com/basics/integrations-overview/#cicd-tools");
      System.out.println("The output of 4");
}
@Test
@Parameters({"vall"})
public static void SolutionAutomationTool()	{
       WebDriver driver;
      driver = new FirefoxDriver();
      driver.get("https://docs.saucelabs.com/basics/integrations-overview/#automation-tools");
}
@Test
public static void SolutiontestReporting()	{
       WebDriver driver;
      driver = new FirefoxDriver();
      driver.get("https://docs.saucelabs.com/basics/integrations-overview/#test-reporting");
      System.out.println("The output 5 ");
}
@Test
@Parameters({"vall"})
public static void SolutionLowCodenoCodemodel()	{
       WebDriver driver;
      driver = new FirefoxDriver();
      driver.get("https://docs.saucelabs.com/basics/integrations-overview/#low-codeno-comodel-and-test-reporting");
      System.out.println("The output of 6");
}
@Test
@Parameters({"vall"})
public static void SolutionApiManagement()	{
       WebDriver driver;
      driver = new FirefoxDriver();
      driver.get("https://docs.saucelabs.com/basics/integrations-overview/#api-managemnt-and-test-reporting");
      System.out.println("The output of 7");
}
@Test
@Parameters({"vall"})
public static void Pricing()	{
       WebDriver driver;
      driver = new FirefoxDriver();
      driver.get("https://docs.saucelabs.com/pricing");
      System.out.println("The output of 8");
}
@Test
@Parameters({"vall"})
public static void DevelopersDoc()	{
       WebDriver driver;
      driver = new FirefoxDriver();
      driver.get("https://docs.saucelabs.com/");
      System.out.println("The output of 9");
}
@Test
@Parameters({"vall"})
public static void Accessibility()	{
       WebDriver driver;
      driver = new FirefoxDriver();
      driver.get("https://docs.saucelabs.com/basics/integrations-overview/#accessibility");
      System.out.println("The output of 10");
}
@Test
@Parameters({"vall"})
public static void DevelopersChangelog()	{
       WebDriver driver;
      driver = new FirefoxDriver();
      driver.get("https://docs.saucelabs.com/basics/en");
}
@Test
@Parameters({"vall"})
public static void DevelopersSeleniumquickstart()	{
       WebDriver driver;
      driver = new FirefoxDriver();
      driver.get("https://docs.saucelabs.com/web-apps/automated-testing/selenium/quickstart/");
}
@Test
@Parameters({"vall"})
public static void DevelopersAppium()	{
       WebDriver driver;
      driver = new FirefoxDriver();
      driver.get("https://docs.saucelabs.com/automated-testing/appium/quickstart/");
}
@Test
@Parameters({"vall"})
public static void DeveloperMobileAppTesting()	{
       WebDriver driver;
      driver = new FirefoxDriver();
      driver.get("https://docs.saucelabs.com/mobile-apps");
}
}
