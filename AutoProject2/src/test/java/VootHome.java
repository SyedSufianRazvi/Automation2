import org.testng.annotations.Test;

import Logic.LaunchBrowsers;
import Logic.VootHomePageLogic;

public class VootHome extends LaunchBrowsers {
	/**
	 * Method to verify UI element in voot home page
	 * 
	 * @throws Exception
	 */
	@Test
	public void homePagevalidation() throws Exception {
		VootHomePageLogic.verifyHomePageNavigation();
		VootHomePageLogic.verifyVootLogo();
		VootHomePageLogic.navigatetomyaccounttab();
		

	}

}
