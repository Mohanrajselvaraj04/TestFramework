package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	public CreateLead() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement elecompanyname;
	
	@And("Enter companyName as (.*)")
	public CreateLead enterCompanyName(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(elecompanyname, data);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement elefirstname;
	
	@And("Enter FirstName as (.*)")
	public CreateLead enterFirstName(String data) {
	 type(elefirstname,data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement elelastname;
	
	@And("Enter lastName as (.*)")
	public CreateLead enterLastName(String data) {
	 type(elelastname,data);
		return this;
	}
	
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement elesubmitcreatelead;
	
	@When("Click createLeadbutton")
	public ViewLead clickCreateLead() {
	click(elesubmitcreatelead);	
	return new ViewLead();
	}
	
	
	
	
	

}
