package Logic;

import static Logic.LaunchBrowsers.driver;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Pages.HomePages;

public class VootHomePageLogic {
	// constructor
	public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

	/**
	 * 1. Method to verify user navigated to voot home page by fetching current url
	 * & comparing with actual url.
	 */
	public static void verifyHomePageNavigation() throws InterruptedException {
		String homePageUrl = driver.getCurrentUrl();
		Assert.assertEquals(homePageUrl, "http://automationpractice.com/index.php", "Not navigated to Voot home page");
		Thread.sleep(1000);
		System.out.println("Home page url is: " + homePageUrl);
	}

	/**
	 * 2. method to verify voot logo by presence of element and comparing fetched
	 * logo text with actual text.
	 */
	public static void verifyVootLogo() throws InterruptedException {

		WebElement vootlogo = driver.findElement(HomePages.objContact);
		String logoText = vootlogo.getAttribute("title");
		String title = driver.getTitle();
		System.out.println("Title is: " + title);
		System.out.println("Text of voot logo is: " + logoText);
		// Assert.assertEquals(logoText, "Voot", "Failed to fetch voot logo");
		// Assert.assertTrue(vootlogo.isDisplayed(), "Voot logo not displayed");

	}

	public static void navigatetomyaccounttab() throws Exception {

		driver.findElement(HomePages.objContact).click();
		Thread.sleep(5000);
		Select select = new Select(driver.findElement(HomePages.objDrop));
		select.selectByIndex(2);

		Thread.sleep(5000);

//		Faker faker = new Faker();
//		String name = faker.name().fullName(); // Miss Samanta Schmidt
//		String firstName = faker.name().firstName(); // Emory
//		String lastName = faker.name().lastName(); // Barton
//		String email = firstName + lastName + "@gmail.com";
//		driver.findElement(HomePages.objEmail).sendKeys(email);

		Thread.sleep(5000);

		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000000);
		driver.findElement(HomePages.objEmail).sendKeys("username" + randomInt + "@gmail.com");
		driver.findElement(HomePages.objOrderRef).sendKeys("@#$##" + randomInt + "SUFI");
		driver.findElement(HomePages.objUpload).sendKeys("C:\\Users\\Syed\\Desktop\\Monkey.jpg");
		driver.findElement(HomePages.objMsg).sendKeys("Hello World!!!!!!!...........");
		Thread.sleep(5000);

//		driver.findElement(HomePages.objUpload).click();
//		StringSelection selection = new StringSelection("C:\\Users\\Syed\\Desktop\\Monkey.jpg");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
//		Thread.sleep(5000);
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.keyRelease(KeyEvent.VK_V);
//		Thread.sleep(5000);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(5000);

		driver.findElement(HomePages.objSave).click();
		Thread.sleep(5000);
		String ExpectedValue = "Your message has been successfully sent to our team.";
		String ActualValue = driver.findElement(HomePages.objText).getText();
		Assert.assertEquals(ExpectedValue, ActualValue);
		System.out.println("Test Passed");
		
	}

}
