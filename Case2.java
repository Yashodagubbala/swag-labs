package testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class Case2 {
	@Test(groups={"Groups1"})
	public static void ProductVisualTesting() {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://saucelabs.com/products/visual-testing");
 System.out.println("class1");
	}
	@Test(groups={"Groups1"})
	public static void ProductSaucePerformance() {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://saucelabs.com/products/sauce-performance");
 System.out.println("class2");
	}
	@Test(groups={"Groups1"})
	public static void ProductSupportedBrowser() {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://saucelabs.com/products/supported-browsers-devices");
 System.out.println("class3");
	}
	@Test(groups={"Groups1"})
	public static void ProductPlatformConfiguator() {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://saucelabs.com/products/platform-configurator");
 System.out.println("class4");
	}
	@Test(groups={"Groups1"})
	public static void ProductDemoTours() {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://saucelabs.com/products/demo-tours");
 System.out.println("class5");
	}
	@Test(groups={"Groups1"})
	public static void SolutionTeams() {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://saucelabs.com/developers");
 System.out.println("class6");
	}
	@Test(groups={"Groups1"})
	public static void SolutionEnterprise() {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://saucelabs.com/products/enterprise");
 System.out.println("class7");
	}
	@Test(groups={"Groups1"})
	public static void SolutionCi() {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://saucelabs.com/ci");
 System.out.println("class8");
	}
	@Test(groups={"Groups1"})
	public static void SolutionDebugging() {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://saucelabs.com/solutions/intelligent-software-debugging");
 System.out.println("class9");
	}
	@Test(groups={"Groups1"})
	public static void SolutionmobileBetaTesting() {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://saucelabs.com/products/mobile-testing/app-betas");
 System.out.println("class10");
	}

}
