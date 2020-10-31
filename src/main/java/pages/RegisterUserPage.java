package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.aventstack.extentreports.ExtentTest;

import hooks.TestNgHooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterUserPage extends TestNgHooks{
	
	public RegisterUserPage() {
		verifyPartialTitle("Patient");
	}
	
	@When("Enter user name in the Registration Page")
	public RegisterUserPage typeUserName(String userName) {
		type(locateElement(language.getProperty("register_userName")),userName);
		return new RegisterUserPage();
	}

	@When("Enter user role in the Registration Page")
	public RegisterUserPage selectRole(String role) {
		selectDropDownUsingVisibleText(locateElement(language.getProperty("register_roleDropdown")),role);
		return new RegisterUserPage();
	}
	
	@When("Enter Name in the Registration Page")
	public RegisterUserPage typeName(String name) {
		type(locateElement(language.getProperty("register_name")),name);
		return new RegisterUserPage();
	}
	
	@When("Enter Name in the Registration Page")
	public RegisterUserPage typeEmail(String email) {
		type(locateElement(language.getProperty("register_email")),email);
		return new RegisterUserPage();
	}
	
	@When("Enter Password in the Registration Page")
	public RegisterUserPage typePassword(String password) {
		type(locateElement(language.getProperty("register_password")),password);
		return new RegisterUserPage();
	}
	
	@When("Enter Confirm Password in the Registration Page")
	public RegisterUserPage typeConfirmPassword(String cnfPassword) {
		type(locateElement(language.getProperty("register_cnfPassword")),cnfPassword);
		return new RegisterUserPage();
	}
	
	@When("Select Security Question in the Registration Page")
	public RegisterUserPage selectSecurityQuestion(String question) {
		selectDropDownUsingVisibleText(locateElement(language.getProperty("register_secQuest")),question);
		return new RegisterUserPage();
	}
	
	@When("Enter Answer in the Registration Page")
	public RegisterUserPage typeAnswer(String answer) {
		type(locateElement(language.getProperty("register_answer")), answer);
		return new RegisterUserPage();
	}
	
	@When("Enter Answer in the Registration Page")
	public RegisterUserPage clickRegister() {
		click(locateElement("xpath",language.getProperty("register_register")));
		return new RegisterUserPage();
	}
	
	@Then("Verify the success message")
	public RegisterUserPage verifySuccess() {
		verifyPartialText(locateElement("xpath",language.getProperty("register_message")),"Success");
		return new RegisterUserPage();
	}
}
