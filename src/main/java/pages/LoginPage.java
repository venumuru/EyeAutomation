package pages;


import org.openqa.selenium.By;
import hooks.TestNgHooks;
import io.cucumber.java.en.When;

public class LoginPage extends TestNgHooks{


	@When("Type username name in Login Page as (.*)$")
	public LoginPage typeUsername(String username) {
		type(getDriver().findElement(By.id("userNameTxt")),username);
		return this;
	}

	@When("Type password in Login Page as (.*)$")
	public LoginPage typePassword(String password) {
		type(getDriver().findElement(By.id("password")),password);
		return this;
	}

	@When("Click Login button in Login Page")
	public MyHomePage clickLogin() {
		click(getDriver().findElement(By.id("loginSubmit")));
		return new MyHomePage();
	}
	
	@When("Login to the application as username (.*) and password as (.*)$")
	public MyHomePage loginLeaftaps(String username, String password) {
		return typeUsername(username).typePassword(password).clickLogin();
	}

}
