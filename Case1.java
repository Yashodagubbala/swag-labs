package testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Case1 {
	@Test(priority='0')
	
	public static void testLoginLoad() {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("Webdriver.gecko.driver", "C:\\WebDriver\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/v1");
		System.out.println("testcase1");
	}
	@Test(priority='1')
	public static void testLoadAbout() {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://saucelabs.com/");
		System.out.println("testcase2");
	}
	@Test(priority='1')
	public static void testLoadProduct() {
		WebDriver driver;	
		driver = new FirefoxDriver();
		driver.get("https://www.saucelabs.com/products");
		System.out.println("testcase3");
	}
	@Test(priority='1')
	public static void TestLoadProductCross() {
		WebDriver driver;	
		driver = new FirefoxDriver();
		driver.get("https://www.saucelabs.com/products/cross-browser-testing");
		System.out.println("testcase4");
}
	@Test(priority='1')
	public static void testLoadProductMobileAppTest() {
		WebDriver driver;	
		driver = new FirefoxDriver();
		driver.get("https://www.saucelabs.com/products/mobile-testing");
		System.out.println("testcase5");
}
	@Test(priority='1')
	public static void testLowcodeTest() {
		WebDriver driver;	
		driver = new FirefoxDriver();
		driver.get("https://www.saucelabs.com/products/low-code-testing");
		System.out.println("testcase6");
}
	@Test(priority='1')
	public static void ProductErrorReporting() {
		WebDriver driver;	
		driver = new FirefoxDriver();
		driver.get("https://www.saucelabs.com/products/error-reporting");
		System.out.println("testcase7");
}
	@Test(priority='1')
	public static void ProductSauceInsights() {
		WebDriver driver;	
		driver = new FirefoxDriver();
		driver.get("https://www.saucelabs.com/products/sauce-insights");
		System.out.println("testcase8");
}
	@Test(priority='1')
	public static void ProductTestchestration() {
		WebDriver driver;	
		driver = new FirefoxDriver();
		driver.get("https://www.saucelabs.com/products/test-orchesstration");
		System.out.println("testcase9");
}
	@Test(priority='1')
	public static void ProductApiTesting() {
		WebDriver driver;	
		driver = new FirefoxDriver();
		driver.get("https://www.saucelabs.com/products/api-testing");
		System.out.println("testcase10");
}
}
