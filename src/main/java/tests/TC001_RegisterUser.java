package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import hooks.TestNgHooks;
import pages.MyHomePage;

public class TC001_RegisterUser extends TestNgHooks{
	
	@BeforeTest
	public void setData() {
		testCaseName = "TC001";
		testDescription = "Register the user in Eye Manage";
		category = "Smoke";
		authors = "Babu";  
		dataSheetName = "TC001";
		nodes = "Eye Manage";
	}
	

	@Test(dataProvider="fetchData")
	public void createLead(String userName, String role, String name, String email,
						   String password, String confirmPassword, String secQuestion, String answer) {
		
		new MyHomePage()
			.clickRegisterUser()
			.typeUserName(userName)
			.selectRole(role)
			.typeName(name)
			.typeEmail(email)
			.typePassword(password)
			.typeConfirmPassword(confirmPassword)
			.selectSecurityQuestion(secQuestion)
			.typeAnswer(answer)
			.clickRegister()
			.verifySuccess();
		
	}
	
	
}
