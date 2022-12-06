package Listeners;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginTesst {

	
	@Test
	public void loginByEmail() {
		Reporter.log("loginBYEmail");
		AssertJUnit.assertEquals("ramu", "ramu");
	}
	@Test
	public void loginByFacebook() {
	Reporter.log("loginByfacebook");	
	AssertJUnit.assertEquals("ramu", "mohan");
	}
}
