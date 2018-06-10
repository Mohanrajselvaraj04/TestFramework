package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeads extends ProjectMethods{
    
    public FindLeads() {      
        PageFactory.initElements(driver,this);
    }   
@FindBy(how=How.XPATH,using="//input[@name='lastName'])[3]")
private WebElement elefirstname;

public void enterFirstName() {
    type(elefirstname, "");
}
    
    
}
