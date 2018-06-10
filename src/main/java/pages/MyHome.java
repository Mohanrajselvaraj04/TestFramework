package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyHome extends ProjectMethods{
	
	public MyHome() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.LINK_TEXT,using="Leads")
	private WebElement eleLeads;
	
	public MyLeads clickLeads() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLeads);
		return new MyLeads();		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
    private WebElement elecreateleadlink;
	
	@And("click createLead")
	public CreateLead createLeadLink() {
	    click(elecreateleadlink);
	    return new CreateLead();
	}
}
