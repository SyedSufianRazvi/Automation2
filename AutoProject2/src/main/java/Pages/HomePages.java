package Pages;

import org.openqa.selenium.By;

public class HomePages {

	public static By objContact = By.xpath("//a[@title='Contact Us']");

	public static By objDrop = By.id("id_contact");

	public static By objEmail = By.id("email");

	public static By objOrderRef = By.id("id_order");
			
	public static By objUpload = By.id("fileUpload");

	public static By objSave = By.xpath("//span[normalize-space()='Send']");
	
	public static By objMsg = By.id("message");
	
	public static By objText = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/p[1]");

}
