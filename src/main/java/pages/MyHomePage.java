package pages;

import org.openqa.selenium.By;
import hooks.TestNgHooks;
import io.cucumber.java.en.When;

public class MyHomePage extends TestNgHooks{
	

	@When("Click Register User in Dashboard")
	public RegisterUserPage clickRegisterUser() {
		click(getDriver().findElement(By.linkText(getProperties().getProperty("home_register"))));
		return new RegisterUserPage();
	}

	
	
	
}
